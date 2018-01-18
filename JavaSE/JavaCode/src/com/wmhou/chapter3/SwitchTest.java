package com.wmhou.chapter3;

/**
 * Description:
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class SwitchTest {

    public static void main(String[] args) {

        String season = "大冷天";
        switch (season) {
            case "春天":
                System.out.println("春回大地");
                break;
            case "夏天":
                System.out.println("骄阳似火");
                break;
            case "秋天":
                System.out.println("秋高气爽");
                break;
            case "冬天":
                System.out.println("冰天雪地");
                break;
            default:
                System.out.println("这不是一个季节嘛~~~");
        }
    }
}
