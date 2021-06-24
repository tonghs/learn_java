package com.tonghs.java.thread_demo;

/**
 * ThreadSleepDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class ThreadSleepDemo {
    public static void main(String[] args) {
        ThreadSleep ts1 = new ThreadSleep();
        ThreadSleep ts2 = new ThreadSleep();
        ts1.start();
        ts2.start();
    }
}
