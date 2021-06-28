package com.tonghs.java.thread_demo;

/**
 * RunnableDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
