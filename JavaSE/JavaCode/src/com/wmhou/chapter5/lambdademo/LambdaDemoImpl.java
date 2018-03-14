package com.wmhou.chapter5.lambdademo;

/**
 * Description:Lambda实例：实现
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-14
 *
 * @author 侯伟民
 * @version 1.0
 */
public class LambdaDemoImpl implements Runnable{

    @Override
    public void run() {

    }

    public static void test(Runnable runnable){
        runnable.run();
    }

    public static void main(String[] args) {
        test(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        });


        test( () -> System.out.println("Lambda expression"));
    }
}


