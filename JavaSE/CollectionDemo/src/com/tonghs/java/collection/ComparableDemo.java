package com.tonghs.java.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * ComparableDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class ComparableDemo {
//    public static void main(String[] args) {
//        TreeSet<Student> ts = new TreeSet<>();
//        Student s1 = new Student("xishi", 29);
//        Student s2 = new Student("wangzhaoju", 28);
//        Student s3 = new Student("diaochan", 30);
//        Student s4 = new Student("yangyuhuan", 33);
//
//        Student s5 = new Student("linqingxia", 33);
//
//        ts.add(s1);
//        ts.add(s2);
//        ts.add(s3);
//        ts.add(s4);
//        ts.add(s5);
//
//        for(Student s: ts) {
//            System.out.println(s.getName() + ":" + s.getAge());
//        }
//    }

    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num =  s1.getAge() - s2.getAge();

                return num == 0 ? s1.getName().compareTo(s2.getName()) : num;
            }
        });

        Student s1 = new Student("xishi", 29);
        Student s2 = new Student("wangzhaoju", 28);
        Student s3 = new Student("diaochan", 30);
        Student s4 = new Student("yangyuhuan", 33);

        Student s5 = new Student("linqingxia", 33);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for(Student s: ts) {
            System.out.println(s.getName() + ":" + s.getAge());
        }
    }
}
