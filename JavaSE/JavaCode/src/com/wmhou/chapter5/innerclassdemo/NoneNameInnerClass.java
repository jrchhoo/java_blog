package com.wmhou.chapter5.innerclassdemo;

/**
 * Description:匿名内部类
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-07
 *
 * @author 侯伟民
 * @version 1.0
 */
public class NoneNameInnerClass {

    public void test(Product product) {
        product.getCount();
        System.out.println("普通方法");
    }

    public static void main(String[] args) {
        NoneNameInnerClass innerClass = new NoneNameInnerClass();
        innerClass.test(new Product() {
            @Override
            public void getCount() {
                System.out.println("重写接口方法");
            }
        });
    }
}

interface Product {
    void getCount();
}
