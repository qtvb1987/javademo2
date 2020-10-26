package com.java.date1026;

import java.util.Arrays;

public class TestDemo01 {
    public static void main(String[] args) {
        String [] strs = {"kkbJava","asdjavaccc","Jaasdhva","siaiq","javacjavaz","iloveJava"};
        String strnew="";
        for (int i=0;i<strs.length;i++){
            String str=strs[i].toLowerCase();
            String valuenew=strs[i];
            if(str.contains("java")){
                valuenew=str.replace("java","");
            }
            strnew+=valuenew.toUpperCase()+",";
        }
        strnew=strnew.substring(0,strnew.lastIndexOf(","));
        String xxx= Arrays.toString(strnew.split(","));
        System.out.println(xxx);
    }
}
