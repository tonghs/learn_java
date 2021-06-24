package com.tonghs.java.producer_consumer;

/**
 * Producer class
 *
 * @author tonghs
 * @date 2021/06/24
 */
public class Producer implements Runnable {
    private MilkBox b;

    public Producer(MilkBox box) {
        this.b = box;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            this.b.put(i);
        }
    }
}
