package com.threaddemo;

public class MyThread02 extends Thread {

    public MyThread02 (String s) {

       super(s);

     }

     public void run() {

      for (int i =0; i<10; i++) {

         try {

          sleep( 1000 );

         } catch (Exception e) { }

        System.out.println( getName() );

      }

    }

}