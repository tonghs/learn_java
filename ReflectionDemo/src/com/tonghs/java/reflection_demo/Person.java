package com.tonghs.java.reflection_demo;

/**
 * Person class
 *
 * @author tonghs
 * @date 2021/06/28
 */
public class Person {
    private String name;
    private int age;
    public String gender;
    public float weight;

    public Person() {

    }

    public Person(String name, int age) {
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
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void eat() {
        System.out.println("eat 被执行了");
    }

    public String eat(String food) {
        System.out.println("eat " + food);
        return food;
    }
}
