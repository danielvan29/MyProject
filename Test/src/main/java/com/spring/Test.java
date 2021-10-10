package com.spring;

import com.spring.bean.A;
import com.spring.config.MyConfig;
import com.spring.context.NewContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author VAN
 */
public class MyContext {

    public static void main(String[] args) {
        NewContext context = new NewContext(MyConfig.class);
        System.out.println(context.getBean(A.class));
    }
}
