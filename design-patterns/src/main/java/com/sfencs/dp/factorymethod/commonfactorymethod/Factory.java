package com.sfencs.dp.factorymethod.commonfactorymethod;

public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> c);

}
