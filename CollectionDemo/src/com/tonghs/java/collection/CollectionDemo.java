package com.tonghs.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * CollectionDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        System.out.println(c.isEmpty());

        c.add("hello");
        c.add("world");
        System.out.println(c);

        System.out.println(c.contains("h"));
        System.out.println(c.contains("hello"));
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.remove("hhhh");

        Iterator<String> it = c.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
