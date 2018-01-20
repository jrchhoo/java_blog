package com.wmhou.chapter4;

/**
 * Description:数组的定义和使用
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ArrayTest {

    public static void main(String[] args)
    {
        //定义数组
        int[] arr1;
        int arr2[]; //不推荐使用这种定义方式

        //数组的初始化
        //静态初始化
        int[] intArr1 = new int[]{1, 3, 5, 7, 9};
        String[] strArr = new String[]{"java", "数组"};

        //动态初始化
        int[] intArr2 = new int[5];
        intArr2[0] = 1;

        //使用数组
        System.out.println("数组intArr1" + "的长度是：" + intArr1.length);
        for (int i = 0; i < intArr1.length; i++){
            System.out.println("索引为："+ i + "的元素的值是：" + intArr1[i]);
        }

        //foreach
        for (int arr: intArr1)
        {
            System.out.println("数组intArr1的元素的值是：" + arr);
        }

        //赋值操作
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++)
        {
            str[i] = "我是数组" + i;
        }
        for (String str1: str)
        {
            System.out.println("数组str的元素的值是：" + str1);
        }

    }
}
