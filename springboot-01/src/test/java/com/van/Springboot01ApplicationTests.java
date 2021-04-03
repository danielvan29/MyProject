package com.van;

import com.van.pojo.Dog;
import com.van.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    Person person;
    @Autowired
    Dog dog;

    @Test
    public void testBoot() {
        System.out.println(dog);
        System.out.println(person);
    }
}
