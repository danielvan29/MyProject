package com.van.consumer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeadQueueConfig {

    @Bean
    public DirectExchange deadExchange() {
        return new DirectExchange("deadExchange", true, false);
    }

    @Bean
    public Queue deadQueue() {
        return new Queue("deadQueue", true);
    }

    @Bean
    public Binding deadBinding() {
        return BindingBuilder.bind(deadQueue()).to(deadExchange()).with("");
    }
}
