package com.wmhou.chapter3;

/**
 * Description:for循环示例
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ForTest {
    public static void main(String[] args)
    {
        //for循环
        for (int i = 0; i < 5; i++)
        {
            System.out.println("这是第" + i++ + "次循环");
        }

        //升级复杂度后的for循环
        for (int i = 0; i <= 5; i++)
        {
            System.out.println("这是第" + i++ + "次循环");
        }
    }
}
