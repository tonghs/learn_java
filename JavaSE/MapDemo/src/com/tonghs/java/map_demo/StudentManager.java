package com.tonghs.java.map_demo;

import java.util.HashMap;
import java.util.Map;

/**
 * StudentManager class
 *
 * @author tonghs
 * @date 2021/06/03
 */
public class StudentManager {
    public static void main(String[] args) {
        Map<String, Student> map = new HashMap<>();
        Student s1 = new Student("linqingxia", 30);
        Student s2 = new Student("zhangmanyu", 35);
        Student s3 = new Student("wangzuxian", 33);

        map.put("001", s1);
        map.put("002", s2);
        map.put("003", s3);

        for(Map.Entry<String, Student> entry: map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().getName());
        }
    }
}
