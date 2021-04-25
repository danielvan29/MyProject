package com.van.cotroller;

import com.van.pojo.Teacher;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    //提供多种访问远程http服务的方法，RestFul模板
    private final RestTemplate template;

    public ConsumerController(RestTemplate template) {
        this.template = template;
    }

    private static final String restUrl = "http://localhost:8001";

    @RequestMapping("/teacher/{id}")
    public Teacher teacher(@PathVariable("id") int id) {
        Teacher teacher = template.getForObject(restUrl+"/tea/"+id,Teacher.class);
        System.out.println(teacher);
        return teacher;
    }
}
