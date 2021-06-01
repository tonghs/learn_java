package com.tonghs.java.generic_demo;

/**
 * Generic class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class Generic<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public <T> void show(T t) {
        System.out.println(t);
    }
}
