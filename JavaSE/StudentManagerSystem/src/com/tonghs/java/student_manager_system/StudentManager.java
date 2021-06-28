package com.tonghs.java.student_manager_system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * StudentManager class
 *
 * @author tonghs
 * @date 2021/05/29
 */
public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<>();
        while (true) {
            System.out.println("--------欢迎使用--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入选择：");

            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();

            switch (line) {
                case "1" :
                    addStudent(array);
                    break;
                case "2" :
                    deleteStudent(array);
                    break;
                case "3" :
                    updateStudent(array);
                    break;
                case "4" :
                    findAllStudent(array);
                    break;
                case "5" :
                    System.out.println("谢谢使用");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("输入错误");
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号：");
        String sid = sc.nextLine();

        System.out.println("请输入姓名：");
        String name = sc.nextLine();

        System.out.println("请输入年龄：");
        String age = sc.nextLine();

        System.out.println("请输入地址：");
        String address = sc.nextLine();

        Student s = new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        array.add(s);

        System.out.println("添加成功");
    }

    public static void findAllStudent(ArrayList<Student> array) {
        if (array.size() > 0) {
            System.out.println("学号\t姓名\t年龄\t居住地");

            for(Student s: array) {
                System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());
            }
        } else {
            System.out.println("暂无");
        }
    }

    public static void deleteStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学号");

        String sid = sc.nextLine();

        for(Student s: array) {
            if (s.getSid().equals(sid)) {
                array.remove(s);
                break;
            }
        }

        System.out.println("删除成功");
    }

    public static void updateStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学号：");
        String sid = sc.nextLine();

        System.out.println("新姓名：");
        String name = sc.nextLine();

        System.out.println("新年龄：");
        String age = sc.nextLine();

        System.out.println("新地址：");
        String address = sc.nextLine();

        Student s = new Student(sid, name, age, address);

        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getSid().equals(sid)) {
                array.set(i, s);
                break;
            }
        }

        System.out.println("修改成功");
    }
}
