package com.wmhou.chapter2;

/**
 * 运算符实例
 */
public class CalcTest {

    public static void main(String[] args) {
        double d1 = 6.4;
        int d2 = 2;
        int d3 = 0;

        // 加减乘除和取余运算
        System.out.println("d1 + d2 = " + (d1 + d2));
        System.out.println("d1 - d2 = " + (d1 - d2));
        System.out.println("d1 * d2 = " + (d1 * d2));
        System.out.println("d1 / d2 = " + (d1 / d2));

        System.out.println("d1 / d3 = " + (d1 / d3)); //结果输出：d1 / d3 = Infinity
        // System.out.println("d2 / d3 = " + (d2 / d3)); //结果异常

        System.out.println("d1 % d2 = " + (d1 % d2));
        // System.out.println("d2 % d3 = " + (d1 % d3)); //结果异常

        //自增、自减和前置后置
        int i = 5;
        System.out.println(i++);
        System.out.println(i + 3);

        int j = 6;
        System.out.println(++j);
        System.out.println(j + 3);

        int a = 4;
        System.out.println(a++ + 3 + a-- + ++a - 1); //4+3+5+5-1

        //比较运算符和逻辑运算符
        System.out.println(6 > 4 && 3 > 5); //false
        System.out.println(6 > 4 & 3 > 5); //false
        System.out.println(6 > 4 || 3 > 5); //true
        System.out.println(6 > 4 | 3 > 5); //true
        System.out.println(!(6 > 4)); //false
        System.out.println(6 > 4 ^ 5 > 3);  //false

        //三目运算符
        System.out.println(5 >= 3 ? "你是对的" : "你又错了");

        //位运算
        //十进制和二进制的相互转换
        System.out.println("10的二进制表达式是：" + Integer.toBinaryString(10));
        System.out.println("1010的十进制表达式是：" + Integer.parseInt("1010", 2)); //输出1010的十进制表达式是：10

        int m = 6;
        int n = 7;
        System.out.println(m + "的二进制表达式是：" + Integer.toBinaryString(m));
        System.out.println(n + "的二进制表达式是：" + Integer.toBinaryString(n));

        //按位或
        System.out.println(m | n); //输出结果为7，或运算后得到二进制111，转换十进制得到7

        //按位与
        System.out.println(m & n); //输出结果为7，或运算后得到二进制111，转换十进制得到7

        //按位异或
        System.out.println(m ^ n); //输出结果为1，或运算后得到二进制001，转换十进制得到1
        System.out.println("和自己异或：" + (m ^ m)); //输出0
        System.out.println("和0异或：" + (m ^ 0));  //输出本身

        //按位非
        System.out.println(~m); //输出-7

        //左移和右移
        //6的二进制是110
        System.out.println(Integer.toBinaryString(m));
        //6向左移1位后，变成1100，对应的10进制是12
        System.out.println(m<<1);
        //6向右移1位后，变成11，对应的10进制是3
        System.out.println(m>>1);

    }
}
