package com.wmhou.chapter5.lambdademo;

import java.util.Arrays;
import java.util.List;

/**
 * Description:Lambda实例：匿名内部类创建接口对象
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-14
 *
 * @author 侯伟民
 * @version 1.0
 */
class LambdaDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        for (Integer i: list) {
            System.out.println(i);
        }

        list.forEach(i -> System.out.println(i));

        list.forEach(System.out::println);


    }
}
