package com.van.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.daniel.provider.service.TicketService;

import javax.annotation.Resource;

@RestController
public class ConsumerController {

    @Resource
    @Reference
    private TicketService ticketService;

    @RequestMapping("/provide")
    public String getProvider() {
        System.out.println(ticketService.buyTicket());
        return "ok";
    }
}
