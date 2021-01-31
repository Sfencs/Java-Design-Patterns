package com.sfencs.dp.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        InvocationHandler invocationHandler = new MyInvocationHandler(subject);
//        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),invocationHandler);
        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),invocationHandler);
        proxy.doSomething("ss");
    }
}
