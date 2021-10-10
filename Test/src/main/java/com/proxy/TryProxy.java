package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author VAN
 */
public class TryProxy {

    public static void main(String[] args) {
        MyTarget target = new TargetImpl();
        InvocationHandler myProxy = new ProxyTest(target);
        MyTarget proxyInstance = (MyTarget)Proxy.newProxyInstance(TargetImpl.class.getClassLoader(), TargetImpl.class.getInterfaces(), myProxy);
        proxyInstance.target();
    }
}
