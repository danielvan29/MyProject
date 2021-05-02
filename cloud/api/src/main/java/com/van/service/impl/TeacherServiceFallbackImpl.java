package com.van.service.impl;

import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceFallbackImpl implements TeacherService {

    public Teacher queryById(int id) {
        return new Teacher().setId(0).setName("没有用户");
    }
}
