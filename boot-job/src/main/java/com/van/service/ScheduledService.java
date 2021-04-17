package com.van.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class ScheduledService {

    //定时作业
    @Scheduled(cron = "0/5 * * * * ?")
    public void test() {
        System.out.println("time");
    }
}
