package com.van.producer.controller;

import com.van.producer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("all")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/{id}")
    public String order(@PathVariable("id") String id) {
        orderService.order(id);
        return "下单成功";
    }
}
