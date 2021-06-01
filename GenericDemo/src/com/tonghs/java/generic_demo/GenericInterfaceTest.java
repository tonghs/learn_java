package com.tonghs.java.generic_demo;

/**
 * GenericInterfaceTest class
 *
 * @author tonghs
 * @date 2021/06/02
 */
public class GenericInterfaceTest {
    public static void main(String[] args) {
        GenericInterface<String> gi = new GenericInterfaceImpl<>();
        gi.show("lll");

        GenericInterface<Integer> gi1 = new GenericInterfaceImpl<>();
        gi1.show(20);
    }
}
