package com.wmhou.chapter5.statictest;

/**
 * Description:初始化块和静态初始化演示
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-27
 *
 * @author 侯伟民
 * @version 1.0
 */

public class Person {
    private int id;
    private String name;
    private String gender;
    private String address;
    {
        System.out.println("------第一个初始化块------");
    }

    {
        System.out.println("------第二个初始化块------");
    }
    static {
        System.out.println("----第一个静态初始化块---");
    }
    static {
        System.out.println("----第二个静态初始化块---");
    }

    public Person() {
        System.out.println("---无参构造器---");
    }

    public static void main(String[] args) {
        new Person();
        new Person();

    }
}
