package com.wmhou.chapter5.extendstest;

/**
 * Description:继承之构造方法
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Employee {
    private String id;
    private String name;
    private String department;

    public Employee() {
        System.out.println("父类无参的构造方法");
    }

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
        System.out.println("父类有参的构造方法");
    }
}
