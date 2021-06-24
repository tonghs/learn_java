package com.tonghs.java.producer_consumer;

/**
 * TestDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class TestDemo {
    public static void main(String[] args) {
        MilkBox box = new MilkBox();

        Producer p = new Producer(box);
        Consumer c = new Consumer(box);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
