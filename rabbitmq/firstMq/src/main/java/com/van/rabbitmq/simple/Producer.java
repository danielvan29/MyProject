package com.van.rabbitmq.simple;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

//import java.io.IOException;
//import java.util.concurrent.TimeoutException;

@SuppressWarnings("all")
public class Producer {

    public static void main(String[] args) {

        //创建连接工厂
        ConnectionFactory connectionFactory = new ConnectionFactory();
        connectionFactory.setHost("47.115.172.160");
        connectionFactory.setPort(5672);
        connectionFactory.setUsername("van");
        connectionFactory.setPassword("15119323532");
        connectionFactory.setVirtualHost("/");

        Connection connection = null;
        Channel channel = null;

        try {
            //创建连接
            connection = connectionFactory.newConnection("生产者");
            //获取通道
            channel = connection.createChannel();
            /*
             * @params1:队列名
             * @params2:是否持久化
             * @params3:排他性
             * @params4:自动删除
             * @params5:附加参数
             */
            String queueName = "queue1";
            channel.queueDeclare(queueName, false, false, false, null);
            String msg = "hello mq";
            channel.basicPublish("", queueName, null, msg.getBytes());
            System.out.println("消息推送成功");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (channel != null && channel.isOpen()) {
                try {
                    channel.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (connection != null && connection.isOpen()) {
                try {
                    connection.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
