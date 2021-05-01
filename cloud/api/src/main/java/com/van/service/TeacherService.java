package com.van.service;

import com.van.pojo.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "PROVIDER")
public interface TeacherService {

    @RequestMapping("/tea/{id}")
    Teacher queryById(@PathVariable(value = "id") int id);
}
