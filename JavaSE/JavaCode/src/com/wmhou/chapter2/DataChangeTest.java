package com.wmhou.chapter2;

/**
 * 基本数据类型之间的类型转换
 */
public class DataChangeTest {

    public static void main(String[] args) {
        byte b = 100;
        int i = b;
        System.out.println("b = " + b);

        long l = 1000L;
        float f1 = l;
        System.out.println("f1 = " + f1);

        float f = 3.14F;
        double d = f;
        System.out.println("d = " + d);

        char c = 'A';
        int i1 = c;
        System.out.println("i1 = " + i1);

        byte b1 = 65;
        //byte类型不能自动转换为char类型
        //char c1 = b1;

        char c1 = 'B';
        //以下代码将编译报错，char型不能自动转换为byte型
        //byte b2 = c1;
        //short s = c1;

        int i2 = 130;
        byte b2 = (byte)i2;
        System.out.println(b2);

        short s = 10;
        int i3 = 100;
        i3 = i3 + s;
        System.out.println("i3 = " + i3);

        System.out.println("hello" + 'A' + 3);
        System.out.println(7 + 'A' + "hello");
    }
}
