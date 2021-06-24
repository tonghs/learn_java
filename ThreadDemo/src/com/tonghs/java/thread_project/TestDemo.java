package com.tonghs.java.thread_project;

/**
 * TestDemo class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class TestDemo {
    public static void main(String[] args) {
        TicketSeller ts1 = new TicketSeller();

        Thread th1 = new Thread(ts1, "seller 1");
        Thread th2 = new Thread(ts1, "seller 2");
        Thread th3 = new Thread(ts1, "seller 3");

        th1.start();
        th2.start();
        th3.start();
    }
}
