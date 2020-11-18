package com.threaddemo;

public  class MyThread extends Thread {

    public void run() {

        displayOutput("t is run");

    }

    public void displayOutput(String s){

        System.out.println(s);

    }
}

