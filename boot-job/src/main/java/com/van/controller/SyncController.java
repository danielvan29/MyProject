package com.van.controller;

import com.van.service.SyncService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class SyncController {

    @Resource
    SyncService syncService;

    @RequestMapping("test")
    public String syncTest() {
        syncService.sync();
        return "finish";
    }
}
