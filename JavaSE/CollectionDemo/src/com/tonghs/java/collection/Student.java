package com.tonghs.java.collection;

/**
 * Student class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        int num =  getAge() - o.getAge();

        return num == 0 ? name.compareTo(o.getName()) : num;
    }
}
