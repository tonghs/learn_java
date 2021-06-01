package com.tonghs.java;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        long start = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
