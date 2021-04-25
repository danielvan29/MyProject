package com.van.service.impl;

import com.van.mapper.TeacherMapper;
import com.van.pojo.Teacher;
import com.van.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    final
    TeacherMapper teacherMapper;

    @Autowired
    public TeacherServiceImpl(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public List<Teacher> getTeachers() {
        return teacherMapper.getTeachers();
    }

    public Teacher getTeacher(int id) {
        return teacherMapper.getTeacher(id);
    }
}
