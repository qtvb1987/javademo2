package com.java.apidemo;

/**
 * 转换方法
 */
public class StringDemo04 {
    public static void main(String[] args) {
        String s1="abc";
        //字符串 转换成char数组
        char[] c1=s1.toCharArray();
        //将字符串转换成 byte数组
        byte[] b1=s1.getBytes();
        System.out.println("replace 替换 "+s1.replace('a','b'));
        System.out.println(b1);
    }
}
