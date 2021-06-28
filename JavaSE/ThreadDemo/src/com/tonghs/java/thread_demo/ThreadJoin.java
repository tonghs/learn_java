package com.tonghs.java.thread_demo;

/**
 * ThreadJoin class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class ThreadJoin extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
