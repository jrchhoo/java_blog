package com.wmhou.chapter4;

import java.util.Arrays;

/**
 * Description:二维数组
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class PlanarArrayTest {
    public static void main(String[] args)
    {
        //定义一个二维数组
        int[][] arr = new int[2][1];
        arr[0] = new int[]{1,3,5};
        arr[1] = new int[]{2,4,6,8};
        for (int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }


        int[][] arr1 = new int[][]{{1,3,5}, {2,4,6}, {7,8,9}};
        for (int[] a: arr1)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
