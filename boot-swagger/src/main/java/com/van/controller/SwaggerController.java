package com.van.controller;

import com.van.pojo.Person;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

    @RequestMapping("/hello")
    @RequestBody
    public Person test1(Person person) {
        return new Person("sam",12);
    }
}
