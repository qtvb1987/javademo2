package com.java.calendardemo;

import javax.jws.soap.SOAPBinding;
import java.util.Calendar;

/**
 * 日历类 Calendar
 */
public class CalendarDemo01 {
    public static void main(String[] args) {
        //获取日历对象
        Calendar calendar=Calendar.getInstance();
        //获取年
        int year=calendar.get(calendar.YEAR);

        System.out.println(year);
        //获取月
        int month=calendar.get(calendar.MONTH);
        System.out.println(month+1);

        int day=calendar.get(calendar.DAY_OF_MONTH);
        System.out.println(day);

    }
}
