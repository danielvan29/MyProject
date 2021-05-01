package com.van.service;

import com.van.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> getTeachers();

    Teacher getTeacher(int id);
}
