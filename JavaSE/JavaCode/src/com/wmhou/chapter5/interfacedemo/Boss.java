package com.wmhou.chapter5.interfacedemo;

/**
 * Description:接口demo
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-04
 *
 * @author 侯伟民
 * @version 1.0
 */
public interface Boss{
    int ID = 1;

    void setWork(String msg);

    static void eat (String food)
    {
        System.out.println("午餐是：" + food);
    }
}
