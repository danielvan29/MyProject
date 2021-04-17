package com.van.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ShiroController {

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }

    @RequestMapping("/add")
    public String add() {
        return "add";
    }

    @RequestMapping("login")
    public String login(@RequestParam("name") String name, @RequestParam("password") String password) {
        //获取当前对象
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(name,password);
        //登录
        try {
            subject.login(token);
            return "success";
        } catch (UnknownAccountException uae) {
            return "login";
        } catch (IncorrectCredentialsException ice) {
            return "login";
        } catch (LockedAccountException lae) {
            return "login";
        }
    }
}
