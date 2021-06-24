package com.tonghs.java.producer_consumer;

/**
 * Consumer class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class Consumer implements Runnable {
    private  MilkBox b;
    public Consumer(MilkBox box) {
        this.b = box;
    }

    @Override
    public void run() {
        while (true) {
            this.b.get();
        }
    }
}
