package com.tonghs.java.date_utils;

import javax.xml.stream.events.DTD;
import java.text.ParseException;
import java.util.Date;

/**
 * DateUtilsDemo class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class DateUtilsDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s1 = DateUtils.dateToSting(d, "yyyy-MM-dd");
        System.out.println(s1);

        String s3 = DateUtils.dateToSting(d);
        System.out.println(s3);


        Date d1 = DateUtils.stringToDate(s1, "yyyy-MM-dd");
        System.out.println(d1);


        Date d2 = DateUtils.stringToDate(s3);
        System.out.println(d2);

        Date d3 = DateUtils.stringToDate(s3, DateUtils.defaultFormat);
        System.out.println(d3);
    }
}
