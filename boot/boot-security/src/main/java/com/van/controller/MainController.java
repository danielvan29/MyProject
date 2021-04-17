package com.van.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String login() {
        return "hello";
    }

    @RequestMapping("/t1")
    public String loginSuccess() {
        return "success";
    }
}
