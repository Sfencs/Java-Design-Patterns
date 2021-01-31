package com.sfencs.dp.abstractfactorypattern;

public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creater1();
        AbstractCreator creator2 = new Creater2();
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductB b1 = creator1.createProductB();
        AbstractProductA a2 = creator2.createProductA();
        AbstractProductB b2 = creator2.createProductB();
    }
}
