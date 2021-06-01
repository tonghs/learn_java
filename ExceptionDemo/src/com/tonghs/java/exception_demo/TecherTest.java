package com.tonghs.java.exception_demo;

import java.net.SocketException;
import java.util.Scanner;

/**
 * TecherTest class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class TecherTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please input score: ");
        int score = sc.nextInt();

        Teacher t = new Teacher();
        try {
            t.checkScore(score);
        } catch (ScoreException e) {
            System.out.println(e.getMessage());
        }
    }
}
