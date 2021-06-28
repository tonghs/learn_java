package com.tonghs.java.thread_demo;

import java.util.Timer;

/**
 * MyThread class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class MyThread extends Thread {
    public MyThread() {

    }

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ": " + i);
        }
    }
}
