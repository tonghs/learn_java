package com.tonghs.java.lambda_demo;

/**
 * LambdaDemo class
 *
 * @author tonghs
 * @date 2021/06/26
 */
public class LambdaDemo {
    public static void main(String[] args) {
//        MyRunnable r = new MyRunnable();
//        new Thread(r).start();

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("start a new thread");
//            }
//        }).start();

        new Thread( () -> {
            System.out.println("start a new thread");
        }).start();
    }
}
