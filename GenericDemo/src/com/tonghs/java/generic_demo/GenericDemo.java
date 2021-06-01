package com.tonghs.java.generic_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * GenericDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class GenericDemo {
    public static void main(String[] args) {
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<>();
        c.add("hello");
        c.add("world");


        Iterator<String> it = c.iterator();
        while(it.hasNext()) {
//            Object s = it.next();
//            String s = (String)it.next();
            String s = it.next();
            System.out.println(s);
        }
    }
}
