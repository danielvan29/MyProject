package com.van.service.impl;

import com.van.service.UserService;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("add");
    }

    public void delete() {
        System.out.println("delete");
    }

    public void update() {
        System.out.println("update");
    }

    public void select() {
        System.out.println("select");
        //throw new RuntimeException();
    }
}
