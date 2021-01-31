package com.sfencs.dp.factorymethodpattern.simplefactory;

public class Client {
    public static void main(String[] args) {
        Product product1 = SimpleFactory.createProduct(ConcreteProduct1.class);
        Product product2 = SimpleFactory.createProduct(ConcreteProduct2.class);
        product1.method1();
        product1.method2();
        product2.method1();
        product2.method2();
    }
}
