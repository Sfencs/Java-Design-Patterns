package com.sfencs.dp.proxypattern;

public class RealSubject implements Subject{
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething");
    }
}
