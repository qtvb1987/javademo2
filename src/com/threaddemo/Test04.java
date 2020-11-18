package com.threaddemo;

public class Test04 {
    public static void main(String[] args) {
        MyThread02 t1=new MyThread02("t1");
        MyThread02 t2=new MyThread02("t2");
        t1.start();
        t2.start();
    }
}
