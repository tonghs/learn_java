package com.tonghs.java.class_demo;

/**
 * StudentDemo class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("hi");
        s.setAge(-30);
        s.setAge(130);
        s.setAge(30);
        s.setName("tony");

        s.study();
        s.doHomework();
        s.show();

        System.out.println(s.getName() + "," + s.getAge());
    }
}
