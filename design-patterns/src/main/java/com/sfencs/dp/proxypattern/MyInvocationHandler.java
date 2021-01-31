package com.sfencs.dp.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;
    public MyInvocationHandler(Object obj){
        target = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("qianzhi");
        return method.invoke(this.target,args);
    }
}
