package com.van.log;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/*使用注解实现AOP*/

@Aspect
public class AnnotationLog {

    @Before("execution( * com.van.service.impl.UserServiceImpl.select())")
    public void before() {
        System.out.println("front");
    }


    @Around("execution( * com.van.service.impl.UserServiceImpl.select())")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("begin around");
        Object proceed = point.proceed();
        System.out.println("end around");
        return proceed;
    }

    @After("execution( * com.van.service.impl.UserServiceImpl.select())")
    public void after() {
        System.out.println("back");
    }

    @AfterThrowing("execution( * com.van.service.impl.UserServiceImpl.select())")
    public void afterThrowing() {
        System.out.println("after throwing");
    }

    @AfterReturning("execution( * com.van.service.impl.UserServiceImpl.select())")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("after return : " + joinPoint.getSignature());
    }
}
