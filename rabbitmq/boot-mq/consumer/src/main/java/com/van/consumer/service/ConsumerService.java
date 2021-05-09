package com.van.consumer.service;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RabbitListener(queues = {"queue5"})
public class ConsumerService {

    @RabbitHandler
    public void consume(String msg) {
        System.out.println("消费：" + msg);
        //return "消费成功";
    }
}
