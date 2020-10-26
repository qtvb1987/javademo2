package com.java.date1026;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestDemo02 {
    public static void main(String[] args) throws ParseException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入入职日期，输入格式为xxxx年xx月xx日");
        String date=scanner.next();
        DateFormat dateFormat=new SimpleDateFormat("yyyy年MM月dd日");
        Date date1=dateFormat.parse(date);
        long inputTime=date1.getTime();
        long currentTime=System.currentTimeMillis();
        int year=(int)((currentTime-inputTime)/1000/60/60/24/360);
        System.out.println("入职年限="+year);

    }
}
