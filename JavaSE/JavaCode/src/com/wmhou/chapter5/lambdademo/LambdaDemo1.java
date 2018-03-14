package com.wmhou.chapter5.lambdademo;

import java.util.Arrays;
import java.util.List;

/**
 * Description:
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-14
 *
 * @author 侯伟民
 * @version 1.0
 */
public class LambdaDemo1 {

    public static void test(List<Integer> list, LambdaInter<Integer> lambdaInter) {
        for (Integer n : list) {
            if (lambdaInter.exec(n)) {
                System.out.print( n + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("打印所有数");
        test(list, (n) -> true);

        System.out.print("不打印");
        test(list, (n) -> false);

        System.out.print("偶数");
        test(list, (n) -> n % 2 == 0);
    }

}
