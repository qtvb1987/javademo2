package com.threaddemo;

public class Test03 {
    public static void main (String[] args) {
      Thread t = new MyThread();
      MyThread myThread=(MyThread)t;
      myThread.displayOutput("t has ben created");
     // ((MyThread) t).displayOutput("t has ben created");
      t.start();
    }

}

