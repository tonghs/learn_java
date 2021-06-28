package com.tonghs.java.thread_demo;

/**
 * ThreadDaemonDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        Thread.currentThread().setName("Main Thread");

        td2.setDaemon(true);
        td1.setDaemon(true);
        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
        }
    }
}
