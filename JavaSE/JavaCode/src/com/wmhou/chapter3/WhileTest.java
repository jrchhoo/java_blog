package com.wmhou.chapter3;

/**
 * Description:
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-19
 *
 * @author 侯伟民
 * @version 1.0
 */
public class WhileTest {

    public static void main(String[] args)
    {
        //while循环实例
        int i = 0;
        while (i < 5)
        {
            System.out.println("这是第" + i + "次循环");
            i++;
        }

        //do while循环
        int j = 0;
        do {
            System.out.println("这是第" + j + "次循环");
            j++;
        }while(j < 5);
    }
}
