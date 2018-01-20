package com.wmhou.chapter4;

/**
 * Description:查找和排序
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-12
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ArraySortTest {

    public static void main(String[] args) {

        int[] arr = {72, 6, 3, 9, 23, 66, 43, 66, 25, 21, 68, 66, 70};

        //查找最大值并打印
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组arr的最大值是：" + max);

        //冒泡排序
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
