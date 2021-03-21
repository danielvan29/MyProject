package com.van.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.van.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JsonController {

    @RequestMapping(value = "/j1",produces =  {"application/json;charset=UTF-8"})
    @ResponseBody//不走视图解析器，直接返回字符串
    public String jsonTest() throws JsonProcessingException {

        User user = new User("扑街",14);
        ObjectMapper objectMapper = new ObjectMapper();
        String value = objectMapper.writeValueAsString(user);
        return value;
    }
}
