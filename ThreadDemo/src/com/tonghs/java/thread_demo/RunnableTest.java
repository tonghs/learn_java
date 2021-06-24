package com.tonghs.java.thread_demo;

/**
 * RunnableTest class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class RunnableTest {
    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo();

        Thread th = new Thread(rd, "111");
        th.start();

        Thread th2 = new Thread(rd, "222");
        th2.start();
    }
}
