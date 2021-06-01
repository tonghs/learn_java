package com.tonghs.java.args_demo;

/**
 * ArgsDemo class
 *
 * @author tonghs
 * @date 2021/06/02
 */
public class ArgsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 5));
    }

//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    public static int sum(int b, int... a) {
//        System.out.println(a);
        int sum = 0;

        for(int x: a) {
            sum += x;
        }

        return sum;
    }
}
