package com.wmhou.chapter5.extendstest;

/**
 * Description:继承（子类）
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Ostrich extends Birds
{
    public Ostrich(String color) {
        super(color);
    }

    @Override
    public void fly() {
        super.view("鸵鸟颜色白加黑");
        System.out.println("鸵鸟会跑不会飞。。。");
    }

    public static void main(String[] args)
    {
        Ostrich ostrich = new Ostrich("灰色");
        ostrich.view("黑色");
        ostrich.fly();
    }
}

