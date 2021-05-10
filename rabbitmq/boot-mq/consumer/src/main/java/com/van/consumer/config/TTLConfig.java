package com.van.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class TTLConfig {

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("ttlExchange",true,false);
    }

    @Bean
    public Queue ttlQueue() {
        Map<String, Object> args = new HashMap<>();
        args.put("x-message-ttl", 5000);
        args.put("x-dead-letter-exchange", "deadExchange");
        args.put("x-dead-letter-routing-key", "");
        return new Queue("ttlQueue", true, false, false, args);
    }

    @Bean
    public Binding binding() {
        return BindingBuilder.bind(ttlQueue()).to(directExchange()).with("");
    }
}
