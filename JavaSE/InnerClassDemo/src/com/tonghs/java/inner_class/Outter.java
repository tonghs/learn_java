package com.tonghs.java.inner_class;

/**
 * Demo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class Outter {
    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }

    public void method() {
        Inner i = new Inner();
        i.show();
    }

    public void show() {
        class Inner1 {
            public void show() {
                System.out.println("inner1" + num);
            }
        }

        Inner1 i = new Inner1();
        i.show();
    }
}
