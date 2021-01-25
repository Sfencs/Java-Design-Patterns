package com.sfencs.dp.factorymethod.multfactory;

public class ConcreteProduct2Factory extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
