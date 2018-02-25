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
public class Hero extends Person {

    public Hero(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public String info() {
        return "我是子类重写的方法";
    }

    public static void main(String[] args) {
        Person p1 = new Hero("孙大圣", 5000, "男");
        System.out.println(p1.info());

        p1.play();

        Person p2 = new Person("猪二圣", 8000, "男");
        System.out.println(p2.info());

    }
}
