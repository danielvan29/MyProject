package com.van.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String firstHello(HttpServletRequest httpServletRequest, Model model) {
        System.out.println(httpServletRequest.getParameter("name"));
        model.addAttribute("msg", "test111");
        return "test";
    }

    @RequestMapping("/hello2")
    public String secondHello(@RequestParam("username")String name) {
        System.out.println(name);
        return "test";
    }
}
