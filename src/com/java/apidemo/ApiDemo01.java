package com.java.apidemo;

public class ApiDemo01 {
    public static void main(String[] args) {
        //String 声明
        //第一种 创建对象形式 无参构造
        String s1=new String();
        s1="张三";
        System.out.println(s1);
        //第二种 有参构造
        byte[] b1={66,67,68};
        String s2=new String(b1);
        System.out.println(s2);
        //第三种 有参构造 char[]
        char[] c1={'a','b','c'};
        String s3=new String(c1);
        System.out.println(s3);
        //第四种
        String s4="abc";
        System.out.println(s4);
    }


}
