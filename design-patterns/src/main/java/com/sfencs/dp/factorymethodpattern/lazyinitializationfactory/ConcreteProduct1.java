package com.sfencs.dp.factorymethodpattern.lazyinitializationfactory;

public class ConcreteProduct1 extends Product {
    @Override
    public void method1() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public void method2() {
        System.out.println(this.getClass().getName());
    }
}
