package com.tonghs.java.array;

/**
 * ArrayIterator class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class ArrayIterator {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int x: arr) {
            System.out.println(x);
        }
    }
}
