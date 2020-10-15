package com.java.lombokdemo;

import java.util.HashSet;
import java.util.Set;

public class TestDemo01 {
    public static void main(String[] args) {
        Student student=new Student();
        student.setName("aaa");
        System.out.println(student.getName());// student.getName();

        System.out.println(student);


        //带参数构造方法
        Student student1=new Student("ddd",333);
        System.out.println(student1);

        //定义Set集合
        Set<Student> students=new HashSet<Student>();
        students.add(new Student("111",33));
        students.add(new Student("222",22));
        students.add(new Student("333",11));
        students.add(new Student("111",33));
        System.out.println("students="+students);
    }
}
