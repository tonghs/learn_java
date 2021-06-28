package com.tonghs.java.calendar_demo;

import java.util.Calendar;

/**
 * CalenderDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class CalendarDemo {
    public static void main(String[] args) {
        // 多态的形式
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int day = c.get(Calendar.DATE);
        System.out.println(year + "-" + month + "-" + day);

        // 添加 timedelta
        c.add(Calendar.YEAR, -3);

        c.set(2020, 11, 1);
    }
}
