package com.tonghs.java.interface_demo;

/**
 * InterfaceDemo class
 *
 * @author tonghs
 * @date 2021/05/31
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.jumping();
        Cat c = new Cat();
        c.jumping();
    }
}
