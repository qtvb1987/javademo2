package com.java.apidemo;

/**
 * String 类中的方法 ：判断方法
 */
public class StringDemo02 {
    public static void main(String[] args) {
//        String m = "hello,world";
//        String n = "hello,world";
//        String u = new String(m);
//        String v = new String("hello,world");
//        System.out.println(m == n); //true
//        System.out.println(m == u); //false
//        System.out.println(m == v); //false
//        System.out.println(u == v); //false


        // Create three strings in three different ways.
        String s1 = "Hello";
        String s2 = new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();

// Determine which strings are equivalent using the ==
// operator
        System.out.println("s1 == s2? " + (s1 == s2)); // false
        System.out.println("s1 == s3? " + (s1 == s3)); // true

       // String s1="abc";
       // String s2="abc";
        //System.out.println("s1==s2"+s1==s2);
        //boolean s4=(s1==s2);//比校地址
//        if(s1==s2){
//            System.out.println("test");
//        }
        //System.out.println(s1.equals(s2));//比较内容
       // System.out.println(s1.equalsIgnoreCase(s2));
       // System.out.println("s1==s2 "+s1==s2);//比校地址
       // System.out.println("s4 "+s4);
    }


}
