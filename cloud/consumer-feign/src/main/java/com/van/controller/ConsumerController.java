package com.van.controller;

import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("all")
public class ConsumerController {

    @Autowired
    private TeacherService teacherService = null;

    @RequestMapping("/teacher/{id}")
    public Teacher teacher(@PathVariable("id") int id) {
        System.out.println(id);
        return teacherService.queryById(id);
    }
}
