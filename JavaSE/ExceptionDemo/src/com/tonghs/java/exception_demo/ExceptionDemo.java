package com.tonghs.java.exception_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * ExceptionDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("begin");
        method();
        System.out.println("end");
    }

    public static void method() {
        int[] arr = {1, 2, 3};
        try {
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
            e.printStackTrace();
            System.out.println("message: " + e.getMessage());
            System.out.println("toString: " + e.toString());
        }
    }

    public static void method3() throws ArrayIndexOutOfBoundsException {
        int[] arr = {1, 2, 3};
        System.out.println(arr[3]);
    }

    public static void method2() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            sdf.parse("2048-09-01");
        } catch (ParseException e) {
            System.out.println("pass");
        }
    }
}
