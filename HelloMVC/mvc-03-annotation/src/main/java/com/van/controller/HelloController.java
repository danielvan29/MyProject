package com.van.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello(Model model) {
        System.out.println("do hello");
        model.addAttribute("test", "HelloMVC1");
        return "hello";
    }

    @RequestMapping(value = "/")
    public String hello1(Model model) {
        System.out.println("do hello1");
        model.addAttribute("test", "HelloMVC1");
        return "hello";
    }
}
