package com.van;

import com.van.mapper.UserMapper;
import com.van.pojo.User;
import com.van.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootShiroApplicationTests {

    @Autowired
    UserService userService;

    @Test
    void contextLoads() {
        User user = userService.getUserByName("van");
        System.out.println(user);
    }

}
