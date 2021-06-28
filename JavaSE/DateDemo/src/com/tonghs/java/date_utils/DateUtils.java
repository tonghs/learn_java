package com.tonghs.java.date_utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * DateUtils class
 *
 * @author tonghs
 * @date 2021/06/01
 */
public class DateUtils {
    private DateUtils() {}
    public static String defaultFormat = "yyyy-MM-dd HH:mm:ss";

    public static String dateToSting(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);

        return s;
    }

    public static String dateToSting(Date date) {
        return dateToSting(date, defaultFormat);
    }

    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(s);
    }

    public static Date stringToDate(String s) throws ParseException {
        return stringToDate(s, defaultFormat);
    }
}
