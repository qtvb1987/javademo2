package com.java.apidemo;

public class StringDemo05 {
    public static void main(String[] args) {
        String s1="a,b,c,d,e";
        String[] arr=s1.split(",");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
