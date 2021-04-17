package com.van.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("t1")
    public String requestTest() {
        System.out.println("in");
        return "bye";
    }

}
