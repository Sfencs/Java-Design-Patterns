package com.sfencs.dp.factorymethod.lazyinitializationfactory;


import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct(ConcreteProduct1.class);
        Product product2 = ProductFactory.createProduct(ConcreteProduct2.class);
        List<Product> productList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            productList.add(ProductFactory.createProduct(ConcreteProduct1.class));
            productList.add(ProductFactory.createProduct(ConcreteProduct2.class));
        }
        for (Product product : productList) {
            System.out.println(product);
            product.method1();
            product.method2();
        }

    }
}
