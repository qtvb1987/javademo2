package com.threaddemo;

public class Test02 extends Thread {

    public static void main(String[] args) {

        Test02 t1 = new Test02();

        Test02 t2 = new Test02();

        t1.start();

        t2.start();

   }

    public void run() {

     System.out.println(1);

     yield();

    System.out.println(2);

   }
}
