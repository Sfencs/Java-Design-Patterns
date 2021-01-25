package com.sfencs.dp.factorymethod.multfactory;


public class Client {
    public static void main(String[] args) {
        Factory factory1 =  new ConcreteProduct1Factory();
        Factory factory2 =  new ConcreteProduct2Factory();
        Product product1 = factory1.createProduct();
        Product product2 = factory2.createProduct();
        product1.method1();
        product1.method2();
        product2.method1();
        product2.method2();

    }
}
