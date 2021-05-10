package com.van.producer.service;

import org.springframework.amqp.AmqpException;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessagePostProcessor;
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

    public void ttlOrder(String id) {
        System.out.println("ttl");

        //使用MessagePostProcessor给消息设置属性
        MessagePostProcessor messagePostProcessor = new MessagePostProcessor() {
            @Override
            public Message postProcessMessage(Message message) throws AmqpException {
                //可以单独给消息设置过期时间
                message.getMessageProperties().setExpiration("5000");
                message.getMessageProperties().setContentEncoding("UTF-8");
                return message;
            }
        };

        rabbitTemplate.convertAndSend("ttlExchange", "", "下单：" + id, messagePostProcessor);
    }
}
