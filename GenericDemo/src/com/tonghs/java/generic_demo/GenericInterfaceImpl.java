package com.tonghs.java.generic_demo;

/**
 * GenericInterfaceImpl class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class GenericInterfaceImpl<T> implements GenericInterface<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}
