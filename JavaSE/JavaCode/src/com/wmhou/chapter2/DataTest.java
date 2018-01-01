package com.wmhou.chapter2;

/**
 * 4类八种基本数据类型示意
 */
public class DataTest {

    public static void main(String[] args) {
        //整型
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400;
        //byte b1 = 300;
        System.out.println("b = " + b + "\n" + "s = " + s + "\n" + "i = " + i + "\n" + "l = " + l);

        //字符型
        char c1 = 'A';
        //char c2 = 'AB'; //编译错误
        char c3 = '字';
        //char c4 = '字符';//编译错误

        //浮点型
        float f = 3.14F;
        double d = 3.14;

        //布尔型
        boolean b1 = false;
        boolean b2 = true;


    }
}
