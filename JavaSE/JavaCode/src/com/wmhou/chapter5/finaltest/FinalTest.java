package com.wmhou.chapter5.finaltest;

import java.util.Arrays;

/**
 * Description:final修饰符详解
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2017-12-1
 *
 * @author 侯伟民
 * @version 1.0
 */
public class FinalTest extends Super {

    // private final String id;
    private final String name = "final";

    public void testFinal() {
        final int i;
        i = 5;
        System.out.println(i);
    }

    public static void main(String[] args) {
        new FinalTest().testFinal();

        final int[] arr = {2, 4, 6, 8};
        // arr = new int[]{1, 3, 5, 7};
        arr[0] = 1;
        arr[3] = 7;
        System.out.println(Arrays.toString(arr));
    }
}
