package com.java.lombokdemo;

import lombok.*;

/**
 * lombok插件的使用
 */
//@Setter
//@Getter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@EqualsAndHashCode
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String name;
    private int age;
}
