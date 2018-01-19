package com.wmhou.chapter3;

/**
 * Description:嵌套循环
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class NestLoopTest {

    public static void main(String[] args)
    {
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("i的值为：" + i + "；j的值为：" + j);
            }
        }
    }
}
