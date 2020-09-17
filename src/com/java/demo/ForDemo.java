package com.java.demo;

import java.util.Scanner;

public class ForDemo {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();

        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println(str);


    }
}
