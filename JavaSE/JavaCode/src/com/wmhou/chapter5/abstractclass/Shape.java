package com.wmhou.chapter5.abstractclass;

/**
 * Description:抽象类——Shape类
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-01
 *
 * @author 侯伟民
 * @version 1.0
 */
public abstract class Shape {

    //计算周长
    public abstract double calPerimeter();

    //计算面积
    public abstract double calArea();

    public void color(){
        System.out.println("打印颜色的普通方法");
    }

    public Shape() {
        System.out.println("构造方法");
    }
}
