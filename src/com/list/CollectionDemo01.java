package com.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo01 {
    public static void main(String[] args) {
        System.out.println("--1.使用迭代器遍历所有元素，并打印--");
        Collection collection=new ArrayList();
        collection.add("JavaEE企业级开发指南");
        collection.add("Oracle高级编程");
        collection.add("MySQL从入门到精通");
        collection.add("Java架构师之路");
        Iterator iterator= collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("--2.使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；--");
        Collection collection2=new ArrayList();
        collection2.add("JavaEE企业级开发指南");
        collection2.add("Oracle高级编程");
        collection2.add("MySQL从入门到精通");
        collection2.add("Java架构师之路");
        Iterator iterator2= collection2.iterator();
        while (iterator2.hasNext()){
            String v=(String) iterator2.next();
            if(v.length()<10) {
                System.out.println(v);
            }
        }
        System.out.println("--3.使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印--");
        Collection collection3=new ArrayList();
        collection3.add("JavaEE企业级开发指南");
        collection3.add("Oracle高级编程");
        collection3.add("MySQL从入门到精通");
        collection3.add("Java架构师之路");
        collection3.contains("Java");
        Iterator iterator3= collection3.iterator();
        while (iterator3.hasNext()){
            String v=(String) iterator3.next();
            if(v.contains("Java")) {
                System.out.println(v);
            }
        }
        System.out.println("--4.如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。--");
        Collection collection4=new ArrayList();
        collection4.add("JavaEE企业级开发指南");
        collection4.add("Oracle高级编程");
        collection4.add("MySQL从入门到精通");
        collection4.add("Java架构师之路");
        Object[] objects=collection4.toArray();
        for (int i=0;i<objects.length;i++){
            String s=(String) objects[i];
            if(s.contains("Oracle")){
                collection4.remove(s);
            }
        }
        Iterator iterator4= collection4.iterator();
        while (iterator4.hasNext()){
            System.out.println(iterator4.next());
        }
    }
}
