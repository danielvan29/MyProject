package com.van.mapper;

import com.van.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUser(int id);

    User getUserByName(String name);
}
