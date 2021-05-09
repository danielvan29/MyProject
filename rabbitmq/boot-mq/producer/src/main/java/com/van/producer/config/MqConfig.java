package com.van.producer.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MqConfig {

    //声明交换机
    @Bean
    public FanoutExchange fanoutExchange() {
        return new FanoutExchange("myFanout",true,false);
    }

    //声明队列
    @Bean
    public Queue queue1() {
        return new Queue("queue5",true);
    }
        @Bean
    public Queue queue2() {
        return new Queue("queue6",true);
    }

    @Bean
    public Queue queue3() {
        return new Queue("queue7", true);
    }

    //绑定
    @Bean
    public Binding bind1() {
        return BindingBuilder.bind(queue1()).to(fanoutExchange());
    }
    @Bean
    public Binding bind2() {
        return BindingBuilder.bind(queue2()).to(fanoutExchange());
    }
    @Bean
    public Binding bind3() {
        return BindingBuilder.bind(queue3()).to(fanoutExchange());
    }

}
