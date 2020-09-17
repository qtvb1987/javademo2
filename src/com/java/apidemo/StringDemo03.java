package com.java.apidemo;

/**
 * String类中方法 功能方法
 */
public class StringDemo03 {
    public static void main(String[] args) {
        String a="adfdfd12233";
        //字符串长度
        System.out.println("length  "+a.length());
        //字符串拼接
        System.out.println("拼接"+a.concat("我是拼接的"));
        //通过下标返回字符内容
        System.out.println("chartAt  "+a.charAt(2));
        //返回第一次出现索引值
        System.out.println("indexOf" +a.indexOf('d'));
        //截取字符串 传入的截取的初始索引 截取到最后的内容
        System.out.println("substring "+a.substring(8));
    }


}
