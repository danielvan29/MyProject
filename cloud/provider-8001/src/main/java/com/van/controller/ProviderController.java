package com.van.controller;

import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

    final
    TeacherService teacherService;

    @Autowired
    public ProviderController(TeacherService teacherService) {
        this.teacherService = teacherService;
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
        System.out.println(teacher);
        return teacher;
    }
}
