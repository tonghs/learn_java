package com.tonghs.java.lambda_demo;

/**
 * MyRunnable class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("start a new thread");
    }
}
