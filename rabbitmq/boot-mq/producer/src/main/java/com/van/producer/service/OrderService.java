package com.van.producer.service;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@SuppressWarnings("all")
public class OrderService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void order(String id) {
        System.out.println("下单：" + id);
        rabbitTemplate.convertAndSend("myFanout","","下单：" + id);
    }
}
