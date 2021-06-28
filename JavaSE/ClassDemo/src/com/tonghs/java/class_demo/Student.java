package com.tonghs.java.class_demo;

/**
 * Student class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class Student {
    private String name;
    private int age;

    // 封装特性
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 120) {
            System.out.println("年龄设置错误");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void study() {
        System.out.println("学习");
    }

    public void doHomework() {
        System.out.println("做作业");
    }

    public void show() {
        System.out.println(name + "," + age);
    }

    public Student() {
        System.out.println("构造方法执行");
        this.setName("ttt");
        this.setAge(18);
    }

    public Student(String name) {
        System.out.println("构造方法执行设置 name: " + name);
        this.setName(name);
    }
}
