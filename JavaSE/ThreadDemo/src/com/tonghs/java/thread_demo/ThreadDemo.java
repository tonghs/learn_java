package com.tonghs.java.thread_demo;

/**
 * ThreadDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread th1 = new MyThread("th1");
        MyThread th2 = new MyThread("th2");

//        th1.setName("th1");
//        th2.setName("th2");

        th1.setPriority(Thread.MAX_PRIORITY);

        th1.start();
        th2.start();

        System.out.println(th1.getPriority());
        System.out.println(th2.getPriority());

        System.out.println(Thread.currentThread().getName());
    }
}
