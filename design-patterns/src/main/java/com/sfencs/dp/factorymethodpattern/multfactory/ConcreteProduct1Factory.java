package com.sfencs.dp.factorymethodpattern.multfactory;

public class ConcreteProduct1Factory extends Factory{
    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
