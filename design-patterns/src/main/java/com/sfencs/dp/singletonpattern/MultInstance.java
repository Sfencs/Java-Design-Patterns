package com.sfencs.dp.singletonpattern;

import java.util.ArrayList;
import java.util.Random;

/**
 * 单例模式的扩展，有数量的多例模式
 */
public class MultInstance {

    private static final int maxNumOfInstance = 2;

    private static ArrayList<MultInstance> instanceList = new ArrayList<>();

    private static int countNumOfInstance = 0;

    private MultInstance() {

    }

    static {
        for (int i = 0; i < maxNumOfInstance; i++) {
            instanceList.add(new MultInstance());
        }
    }

    public static MultInstance getInstance() {
        Random random = new Random();
        countNumOfInstance = random.nextInt(maxNumOfInstance);
        return instanceList.get(countNumOfInstance);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(MultInstance.getInstance());
        }
    }
}
