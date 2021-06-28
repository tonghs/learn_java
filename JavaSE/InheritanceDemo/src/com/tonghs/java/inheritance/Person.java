package com.tonghs.java.inheritance;

/**
 * Person class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class Person {
    public int age = 23;

    public Person(int age) {
        this.age = age;
    }

    public Person() {

    }

    public void show() {
        System.out.println("show called");
    }
}
