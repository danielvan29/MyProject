package com.van.mapper;

import com.van.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    List<Teacher> getTeachers();

    Teacher getTeacher(int id);
}
