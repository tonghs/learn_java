package com.tonghs.java.generic_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * NewGeneric class
 *
 * @author tonghs
 * @date 2021/06/02
 */
public class NewGeneric {
    public static void main(String[] args) {
        List<?> list1 = new ArrayList<Object>();
        List<?> list2 = new ArrayList<Number>();
        List<?> list3 = new ArrayList<Integer>();

        System.out.println("--------");

        List<? extends Number> list4 = new ArrayList<Integer>();
        List<? extends Number> list5 = new ArrayList<Number>();

        System.out.println("-----------");

        List<? super Number> list6 = new ArrayList<Object>();
        List<? super Number> list7 = new ArrayList<Number>();
//        List<? super Number> list8 = new ArrayList<Integer>();
    }
}
