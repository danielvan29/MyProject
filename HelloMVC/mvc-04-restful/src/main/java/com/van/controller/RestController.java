package com.van.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestController {

    @RequestMapping(value = "/hello/{a}/{b}",method = RequestMethod.GET)
    public String testRest(@PathVariable int a, @PathVariable int b, Model model) {
        System.out.println("restful hello");
        int result = a + b;
        model.addAttribute("num", result);
        return "hello";
    }

    @PostMapping( "/hello/{a}/{b}")
    public String testRestPost(@PathVariable int a, @PathVariable int b, Model model) {
        System.out.println("restful post");
        int result = a + b;
        model.addAttribute("num", result);
        return "hello";
    }
}
