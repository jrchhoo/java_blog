package com.wmhou.chapter5.extendstest;

/**
 * Description:继承（父类）
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-22
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Birds
{
    private String color;

    public Birds(String color)
    {
        this.color = color;
    }

    public void view(String color){
        System.out.println("color："+ color);
    }

    public void fly(){
        System.out.println("鸟儿会飞。。。");
    }

}
