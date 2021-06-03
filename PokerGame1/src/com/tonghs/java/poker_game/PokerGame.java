package com.tonghs.java.poker_game;

import java.util.ArrayList;
import java.util.Collections;

/**
 * PokerGame class
 *
 * @author tonghs
 * @date 2021/06/03
 */
public class PokerGame {
    public static void main(String[] args) {
        // poker box
        ArrayList<String> array = new ArrayList<>();

        // 定义花色
        String[] colors = {"♦️", "♥️", "♠️", "♣️"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        // 装入牌盒
        for(String color: colors) {
            for(String number: numbers) {
                array.add(color + number);
            }
        }
        array.add("小王");
        array.add("大王");
//        System.out.println(array);

        // 洗牌
        Collections.shuffle(array);
//        System.out.println(array);

        // 发牌
        ArrayList<String> lqxArr = new ArrayList<>();
        ArrayList<String> tonghsArr = new ArrayList<>();
        ArrayList<String> yangguoArr = new ArrayList<>();
        ArrayList<String> dipaiArr = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);

            if (i >= array.size() - 3) {
                dipaiArr.add(poker);
            } else if (i % 3 == 0) {
                lqxArr.add(poker);
            } else if (i % 3 == 1) {
                tonghsArr.add(poker);
            } else if (i % 3 == 2) {
                yangguoArr.add(poker);
            }
        }

        // 看牌
        viewPoker("lqx", lqxArr);
        viewPoker("tonghs", tonghsArr);
        viewPoker("yangguo", yangguoArr);
        viewPoker("底牌", dipaiArr);
    }

    public static void viewPoker(String name, ArrayList<String> pokers) {
        System.out.println(name + "的牌是：");

        for(String poker: pokers) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
