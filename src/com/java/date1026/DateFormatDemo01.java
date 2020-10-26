package com.java.date1026;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间格式化
 */
public class DateFormatDemo01 {
    public static void main(String[] args) throws ParseException {
        //当前系统时间
        Date date=new Date();
        //通过DateFormat类提供的功能，把日期对象转换为我们希望的展示格式
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        //通过dateFormat中的格式化方法，格式化日期对象
        String dateformat = dateFormat.format(date);
        System.out.println(dateformat);

        //解析: 把指定的日期形式的字符串，转换为Date对象
        DateFormat dateFormat1=new SimpleDateFormat("yyyy-MM-dd");
        Date date1= dateFormat1.parse("2020-10-12");

        System.out.println("date1="+date1);
    }
}
