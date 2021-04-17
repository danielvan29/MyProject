package com.van;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.van.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
class RedisApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        //redisTemplate.opsForValue().set("test","hello");
        System.out.println(redisTemplate.opsForValue().get("test"));
    }

    @Test
    void myTest() throws JsonProcessingException {
        Person person = new Person("bob",14);
        String value = new ObjectMapper().writeValueAsString(person);
        redisTemplate.opsForValue().set("person3",value);
    }

}
