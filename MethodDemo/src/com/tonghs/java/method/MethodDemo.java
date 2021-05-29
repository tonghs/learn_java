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
        System.out.println(isEvenNumber(a));
    }

    public static boolean isEvenNumber(int num) {
        return num % 2 == 0;
    }
}
