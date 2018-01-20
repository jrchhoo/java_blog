package com.wmhou.chapter4;

import java.util.Arrays;

/**
 * Description:Arrays增强工具类
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ArraysTest {

    public static void main(String[] args) {
        //定义数组1
        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        //定义数组2
        int[] arr2 = new int[]{6, 4, 8, 2};

        System.out.println("数组是否相等：" + Arrays.equals(arr1,arr2));

        //使用Arrays.binarySearch前需要对数组排序，否则结果会不准确
        System.out.println("排序后：查看对应元素的索引：" + Arrays.binarySearch(arr1, 7));
        System.out.println("排序前：查看对应元素的索引：" + Arrays.binarySearch(arr2, 2));

        //定义数组3进行复制操作
        int[] arr3 = Arrays.copyOfRange(arr1, 2, 4);
        System.out.println("转化为字符串：" + Arrays.toString(arr3));

        //排序
        Arrays.sort(arr2);
        System.out.println("数组arr2排序之后：" + Arrays.toString(arr2));

        //填充
        Arrays.fill(arr3, 9);
        System.out.println("数组arr2排序之后：" + Arrays.toString(arr3));

    }
}
