package com.van;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync //开启异步任务
@SpringBootApplication
public class BootJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootJobApplication.class, args);
    }

}
