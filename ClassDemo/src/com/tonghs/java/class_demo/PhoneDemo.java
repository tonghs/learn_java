package com.tonghs.java.class_demo;

/**
 * PhoneDemo class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class PhoneDemo {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p.brand);
        System.out.println(p.price);

        p.brand = "xiaomi";
        p.price = 299;

        System.out.println(p.brand);
        System.out.println(p.price);
        p.call();
        p.sendMessage();
    }
}
