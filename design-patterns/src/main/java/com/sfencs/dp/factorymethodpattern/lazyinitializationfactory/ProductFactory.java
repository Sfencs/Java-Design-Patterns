package com.sfencs.dp.factorymethodpattern.lazyinitializationfactory;

import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private static final Map<String,Product> map = new HashMap<>();
    public static synchronized  <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        if(map.containsKey(c.getName())){
            product = map.get(c.getName());
        }else {
            try {
                product = (Product) Class.forName(c.getName()).newInstance();
                map.put(c.getName(),product);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (T) product;

    }
}
