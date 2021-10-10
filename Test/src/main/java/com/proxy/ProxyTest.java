package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author VAN
 */
public class ProxyTest implements InvocationHandler {

    private Object target;

    public ProxyTest(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("begin proxy");
        method.invoke(target,args);
        System.out.println("end proxy");
        return null;
    }
}
