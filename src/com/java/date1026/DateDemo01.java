package com.java.date1026;

import java.util.Date;

public class DateDemo01 {
    public static void main(String[] args) {
        //获取当前系统时间
        Date date=new Date();
        System.out.println("date="+date);
        //获取标准的基准时间
        Date date1=new Date(0);

        long currentTime=  date.getTime();
        System.out.println("currentTime="+currentTime);
        System.out.println("date1="+date1);
        date1.setTime(1603679125351l);
        System.out.println("date1="+date1);
    }
}
