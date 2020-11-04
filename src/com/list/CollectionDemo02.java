package com.list;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo02 {
    public static void main(String[] args) {
        System.out.println("---使用增强for遍历所有元素，并打印---");
        Collection<Double> cd=new ArrayList<>();
        cd.add(88.5);
        cd.add(39.2);
        cd.add(77.1);
        cd.add(56.8);
        cd.add((double)89);
        cd.add((double)99);
        cd.add(59.5);
        for (double d:cd
             ) {
            System.out.println(d);

        }
        System.out.println("---使用增强for遍历所有元素，打印不及格的分数；---");
        Collection<Double> cd2=new ArrayList<>();
        cd2.addAll(cd);
        for (double d:cd2
             ) {
            if(d<60){
                System.out.println(d);
            }

        }
        System.out.println("---使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。---");
        Collection<Double> cd3=new ArrayList<>();
        cd3.addAll(cd);
        int nopass=0;
        double avg=0;
        double avgs=0;
        for (double d:cd2
        ) {
            if(d<60){
                nopass++;
                avg+=d;
            }
            avgs+=d;

        }
        System.out.println("不及格的分数的数量="+nopass);
        System.out.println("不及格的分数的平均分=" +String.format("%.2f",(avg / nopass)));
        System.out.println("平均分="+String.format("%.2f",(avgs/cd3.size())));

    }
}
