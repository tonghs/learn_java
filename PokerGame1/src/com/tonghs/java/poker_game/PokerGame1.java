package com.tonghs.java.poker_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * PokerGame class
 *
 * @author tonghs
 * @date 2021/06/03
 */
public class PokerGame1 {
    public static void main(String[] args) {
//        // poker box
//        ArrayList<String> array = new ArrayList<>();
//
//        // 定义花色
//        String[] colors = {"♦️", "♥️", "♠️", "♣️"};
//        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        // 创建 HashMap 存编号和牌
        HashMap<Integer, String> map = new HashMap<>();

        // 创建 ArrayList 存编号
        ArrayList<Integer> list = new ArrayList<>();

        // 定义花色
        String[] colors = {"♦️", "♥️", "♠️", "♣️"};


        // 定义花色
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        for (String color : colors) {
            for (String number : numbers) {
                list.add(index);
                map.put(index, color + number);
                index++;
            }
        }
        map.put(index, "小王");
        list.add(index);
        map.put(++index, "大王");
        list.add(index);

        // 洗牌
        Collections.shuffle(list);

        // 发牌
        TreeSet<Integer> lqx = new TreeSet<>();
        TreeSet<Integer> ly = new TreeSet<>();
        TreeSet<Integer> fqy = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            int x = list.get(i);
            if (i >= list.size() - 3) {
                dipai.add(x);
            } else if (i % 3 == 0) {
                lqx.add(x);
            } else if (i % 3 == 1) {
                ly.add(x);
            } else if (i % 3 == 2) {
                fqy.add(x);
            }
        }

        viewPoker("lqx", lqx, map);
        viewPoker("ly", ly, map);
        viewPoker("fqy", fqy, map);
        viewPoker("dipai", dipai, map);
    }

    public static void viewPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> map) {
        System.out.println(name + "的牌是：");
        for (int index : ts) {
            System.out.print(map.get(index) + "  ");
        }
        System.out.println();
    }

}
