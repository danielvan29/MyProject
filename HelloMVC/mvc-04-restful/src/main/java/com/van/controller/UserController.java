package com.van.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/u1")
    public String userTest(@RequestParam String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/u1")
    public String userTestPost(@RequestParam String name, Model model) {
        System.out.println("post: "+ name);
        model.addAttribute("name", name);
        return "hello";
    }

}
