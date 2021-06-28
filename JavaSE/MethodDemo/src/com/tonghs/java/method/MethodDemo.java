package com.tonghs.java.method;

/**
 * MethodDemo class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class MethodDemo {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        System.out.println(isEvenNumber(a));
        System.out.println(getMax(a, b));
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }
}
