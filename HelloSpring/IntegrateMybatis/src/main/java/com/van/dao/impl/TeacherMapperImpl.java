package com.van.dao.impl;

import com.van.dao.TeacherMapper;
import com.van.pojo.Teacher;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class TeacherMapperImpl extends SqlSessionDaoSupport implements TeacherMapper {
    @Override
    public List<Teacher> getTeacher(int id) {
        return getSqlSession().getMapper(TeacherMapper.class).getTeacher(id);
    }
}
