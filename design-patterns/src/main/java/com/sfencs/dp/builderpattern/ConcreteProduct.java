package com.sfencs.dp.builderpattern;

public class ConcreteProduct extends Builder{
    private Product product = new Product();
    @Override
    public void setPart() {
        //对产品进行一些设置
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
