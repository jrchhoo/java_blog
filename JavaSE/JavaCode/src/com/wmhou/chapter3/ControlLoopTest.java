package com.wmhou.chapter3;

/**
 * Description:循环控制
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-19
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ControlLoopTest {

    public static void main(String[] args) {

        //break实例
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("i的值为：" + i + "；j的值为：" + j);
                break;
            }
        }

        //continue实例
        for (int i = 0; i < 3; i++)
        {
            if (i == 1)
            {
                continue;
            }
            System.out.println("这是第" + i + "次循环！");
        }

        //return实例
        for (int i = 0; i < 2; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.println("i的值为：" + i + "；j的值为：" + j);
                return;
            }
        }
    }
}
