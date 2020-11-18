package com.threaddemo;

public class RunnableDemo implements Runnable {

    public static void main (String[] args) {

      Thread t = new Thread(new RunnableDemo() );

      t.start();

    }

    public void run(int num) {

      for (int i =0; i < num; i++) {

       System.out.println( i );

     }

  }

    @Override
    public void run() {
        for (int i =0; i < 10; i++) {

            System.out.println( i );

        }
    }
}
