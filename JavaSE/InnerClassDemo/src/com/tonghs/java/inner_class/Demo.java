package com.tonghs.java.inner_class;

/**
 * Demo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class Demo {
    public static void main(String[] args) {
        // 不常用
        // Outter.Inner i = new Outter().new Inner();
        Outter o = new Outter();
        o.method();
        o.show();
    }
}
