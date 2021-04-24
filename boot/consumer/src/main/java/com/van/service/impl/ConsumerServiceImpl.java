package com.van.service.impl;

import com.van.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service("consumerServiceImpl")
public class ConsumerServiceImpl implements ConsumerService {
    @Override
    public String use() {
        return "null";
    }
}
