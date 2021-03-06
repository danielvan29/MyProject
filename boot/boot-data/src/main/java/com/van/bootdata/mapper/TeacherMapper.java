package com.van.bootdata.mapper;

import com.van.bootdata.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TeacherMapper {

    List<Teacher> getTeacher();
}
