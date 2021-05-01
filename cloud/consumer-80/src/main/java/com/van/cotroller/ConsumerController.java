package com.van.cotroller;

import com.van.pojo.Teacher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SuppressWarnings("all")
public class ConsumerController {

    //提供多种访问远程http服务的方法，RestFul模板
    private final RestTemplate template;

    public ConsumerController(RestTemplate template) {
        this.template = template;
    }

    //使用Ribbon实现负载均衡，应该通过服务名来访问
    private static final String restUrl = "http://localhost:8001";
    private static final String ribbonUrl = "http://PROVIDER";


    @RequestMapping("/teacher/{id}")
    public Teacher teacher(@PathVariable("id") int id) {
        Teacher teacher = template.getForObject(ribbonUrl+"/tea/"+id,Teacher.class);
        System.out.println(teacher);
        return teacher;
    }
}
