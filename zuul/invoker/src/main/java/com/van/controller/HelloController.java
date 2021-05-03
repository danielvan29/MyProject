package com.van.controller;

import com.van.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/service01/{parm}")
    public String hello(@PathVariable("parm") String parm) {
        System.out.println("INVOKER");
        return helloService.hello(parm);
    }
}
