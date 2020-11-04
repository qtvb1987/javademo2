package com.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();

        ArrayList<Person> list2 = new ArrayList<>();

        ArrayList<Student> list3 = new ArrayList<>();

        ArrayList<JavaStudent> list4 = new ArrayList<>();

        ArrayList<UIStudent> list5 = new ArrayList<>();

        ArrayList<Teacher> list6 = new ArrayList<>();

        ArrayList<JavaTeacher> list7 = new ArrayList<>();

        ArrayList<UITeacher> list8 = new ArrayList<>();

        //可以调用print1()方法
        print1(list1);
        print1(list2);
        print1(list3);
        print1(list4);
        print1(list5);
        print1(list6);
        print1(list7);
        print1(list8);
        //可以调用print2()方法
        print2(list2);
        print2(list3);
        print2(list4);
        print2(list5);
        print2(list6);
        print2(list7);
        print2(list8);
        //可以调用print3()方法
        print3(list3);
        print3(list4);
        print3(list5);
        //可以调用print4()方法
        print4(list4);
        print4(list3);
        print4(list2);
    }

    //要求：参数可以接收任何泛型的ArrayList参数

    public static void print1(ArrayList<?> list){
        Iterator<?> js= list.iterator();
        while (js.hasNext()){
            System.out.println(js.next());
        }
    }

    //要求：参数可以接收任何Person及其子类泛型的ArrayList参数

    public static void print2(ArrayList<? extends Person> list){
        Iterator<? extends Person> js= list.iterator();
        while (js.hasNext()){
            System.out.println(js.next());
        }
    }

    //要求：参数可以接收任何Student及其子类泛型的ArrayList参数

    public static void print3(ArrayList<? extends Student> list){

        Iterator<? extends Student> js= list.iterator();
        while (js.hasNext()){
            System.out.println(js.next());
        }
    }

    //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数

    public static void print4(ArrayList<? super JavaStudent> list){

        Iterator<? super JavaStudent> js= list.iterator();
        while (js.hasNext()){
            System.out.println(js.next());
        }
    }
}
