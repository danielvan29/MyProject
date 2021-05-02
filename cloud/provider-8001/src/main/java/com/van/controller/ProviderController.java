package com.van.controller;

import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    public ProviderController(@Qualifier("teacherServiceImpl") TeacherService teacherService, DiscoveryClient client) {
        this.teacherService = teacherService;
        this.client = client;
    }

    @RequestMapping("/provide")
    public String provide() {
        List<Teacher> teachers = teacherService.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        return "provide";
    }

    @RequestMapping("/tea/{id}")
    public Teacher tea(@PathVariable("id") int id) {
        Teacher teacher = teacherService.getTeacher(id);
        System.out.println(8001);
        return teacher;
    }

    @RequestMapping("/discover")
    public Object getDiscovery() {
        List<String> services = client.getServices();
        System.out.println(services);

        List<ServiceInstance> instances = client.getInstances("PROVIDER-8001");
        for (ServiceInstance instance : instances) {
            System.out.println("host:" + instance.getHost());
            System.out.println("port:" + instance.getPort());
        }

        return this.client;
    }
}
