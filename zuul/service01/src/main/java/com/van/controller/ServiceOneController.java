package com.van.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneController {

    @RequestMapping("/service01/{parm}")
    public String test(@PathVariable("parm") String parm) {
        System.out.println("SERVICE");
        return "get" + parm;
    }

    @RequestMapping("/")
    public String hello() {
        return "hi";
    }
}
