package com.tongns.java.polymorphism;

/**
 * Demo class
 *
 * @author tonghs
 * @date 2021/05/31
 */
public class Demo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);

        Dog d = new Dog();
        ao.useAnimal(d);

        Animal a = new Cat();
        Cat cc = (Cat)a;
        ao.useAnimal(cc);

        Cat ccc = new Cat();
        ao.useAnimal(ccc);
    }
}
