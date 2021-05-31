package com.tonghs.java.inheritance;

/**
 * Student class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class Student extends Person {
    public int height = 175;
    public int age = 30;

    public void method() {
        System.out.println("method called");
    }

    @Override
    public void show() {
        System.out.println("height: " + height);
        System.out.println("age: " + age);
        System.out.println("parent's class age: " + super.age);
    }
}
