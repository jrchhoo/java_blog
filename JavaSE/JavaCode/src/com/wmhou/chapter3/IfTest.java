package com.wmhou.chapter3;

/**
 * Description: 分支结构之if条件语句
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-12
 *
 * @author 侯伟民
 * @version 1.0
 *
 */
public class IfTest {

    public static void main(String[] args) {

        //if结构
        int score1 = 70;
        if (score1 >= 60)
        {
            System.out.println("成绩：" + score1 + "分，恭喜你，及格了...");
        }

        //if...else...结构
        int score2 = 40;
        if (score2 >= 60)
        {
            System.out.println("成绩：" + score2 + "分，恭喜你，及格了...");
        }
        else
        {
            System.out.println("成绩：" + score2 + "分，没及格啊骚年...");
        }

        //if...else if...else...结构
        int score3 = 76;
        if (score3 < 60)
        {
            System.out.println("成绩：" + score3 + "分，没及格啊骚年...");
        }
        else if (score3 >= 60 && score3 < 80)
        {
            System.out.println("成绩：" + score3 + "分，刚好及格、成绩一般般...");
        }
        else
        {
            System.out.println("成绩：" + score3 + "分，很好很强大...");
        }

        //逻辑错误演示：
        int score4 = 90;
        if (score4 > 60)
        {
            System.out.println("成绩：" + score4 + "分，刚好及格、成绩一般般...");
        }
        else if (score4 > 80)
        {
            System.out.println("成绩：" + score4 + "分，很好很强大...");
        }
        else if (score4 > 100)
        {
            System.out.println("成绩：" + score4 + "分，很明显这是一个bug...");
        }
    }
}
