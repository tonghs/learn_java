package com.tonghs.java;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        System.out.println("开始");

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数:");
        int week = sc.nextInt();

        switch (week) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            default -> System.out.println("not 1");
        }
    }
}
