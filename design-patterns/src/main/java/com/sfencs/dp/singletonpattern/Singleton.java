package com.sfencs.dp.singletonpattern;

/**
 * 单例模式
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
    }
}
