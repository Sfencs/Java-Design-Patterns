package com.sfencs.dp.factorymethod.lazyinitializationfactory;

public class ConcreteProduct2 extends Product {
    @Override
    public void method1() {
        System.out.println(this.getClass().getName());
    }

    @Override
    public void method2() {
        System.out.println(this.getClass().getName());
    }
}
