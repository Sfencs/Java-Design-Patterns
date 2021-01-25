package com.sfencs.dp.factorymethod.simplefactory;


public class SimpleFactory {
    public static  <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;

    }
}
