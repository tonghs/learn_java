package com.tonghs.java.collection;

import java.util.ArrayList;

/**
 * ArrayListDemo class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("abc");
        al.add("def");
        al.add(1, "ghl");

        al.set(2, "ddd");
        System.out.println(al.get(2));

        System.out.println("Array: " + al);

        al.remove("abc");
        System.out.println("Array: " + al);

        al.remove(1);
        System.out.println("Array: " + al);

        System.out.println("size: " + al.size());


        for (String x: al) {
            System.out.println(x);
        }

    }
}
