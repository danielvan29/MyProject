package com.van.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

    private final TeacherService teacherService;

    //获取微服务的配置信息
    private final DiscoveryClient client;

    @Autowired
    public ProviderController(TeacherService teacherService, DiscoveryClient client) {
        this.teacherService = teacherService;
        this.client = client;
    }

    @RequestMapping("/tea/{id}")
    @HystrixCommand(fallbackMethod = "hystrixTea")
    public Teacher tea(@PathVariable("id") int id) {
        Teacher teacher = teacherService.getTeacher(id);
        if (teacher == null) {
            throw new RuntimeException();
        }
        System.out.println(8004);
        return teacher;
    }

    public Teacher hystrixTea(int id) {
        Teacher teacher = new Teacher();
        teacher.setId(0).setName("没有此用户");
        return teacher;
    }
}
