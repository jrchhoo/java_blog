package com.wmhou.chapter5.multi;

/**
 * Description:多态
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-25
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String info() {
        return "姓名是：" + name + "；年龄是：" + age + "；性别是：" + gender;
    }

    public void play() {
        System.out.println("姓名是：" + name + "；年龄是：" + age + "；就是喜欢玩玩玩");
    }
}
