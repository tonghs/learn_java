package com.tonghs.java.thread_project;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * TicketSeller class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class TicketSeller implements Runnable {
    private int tickets = 100;

    private Object obj = new Object();

    private Lock lock = new ReentrantLock();

//    @Override
//    public void run() {
//        synchronized (obj) {
//            while (tickets > 0) {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                    System.out.println(Thread.currentThread().getName() + "： 给你一张，这是第" + tickets + "张");
//                    tickets--;
//                }
//        }
//    }

    @Override
    public void run() {
        while (tickets > 0) {
            try {
                lock.lock();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "： 给你一张，这是第" + tickets + "张");
                tickets--;
            } finally {
                lock.unlock();
            }
        }
    }
}
