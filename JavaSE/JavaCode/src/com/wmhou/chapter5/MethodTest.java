package com.wmhou.chapter5;

import java.util.Arrays;

/**
 * Description:详解方法
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class MethodTest {

    //属性：id
    int id;
    //属性：name
    String name;

    //有参构造方法
    public MethodTest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //无参构造方法
    public MethodTest() {

    }

    //方法1：没有形参
    public void exec() {
        System.out.println("没有形参的方法：id = " + id + "; name = " + name);
    }

    //方法2：有形参
    public void exec(int id, String name) {
        System.out.println("有形参的方法：id = " + id + "; name = " + name);
    }

    //方法3：形参为引用类型
    public void exec(MethodTest test) {
        System.out.println("形参为对象的方法：id = " + test.id + "; name = " + test.name);
    }

    //方法4：有返回值方法
    public String exec(String name) {
        System.out.println("有返回值的方法：name = " + name);
        return "SUCCESS";
    }

    //方法5：形参个数可变的参数
    public void exec(int id, String... name) {
        System.out.println("有返回值的方法：id = " + id + " name = " + Arrays.toString(name));
    }


    //主方法，程序入口
    public static void main(String[] args) {

        MethodTest test1 = new MethodTest(2, "方法");
        test1.exec();

        MethodTest test2 = new MethodTest();
        test2.exec(1, "方法");

        test1.exec(test1);
        test1.exec(test2);
        test2.exec(test1);
        test2.exec(test2);

        String str1 = test1.exec("方法");
        System.out.println(str1);

        String str2 = test2.exec("方法");
        System.out.println(str2);

        test2.exec(3, new String[]{"参数1", "参数2", "参数3"});
        test2.exec(3, "参数1", "参数2", "参数3");
    }
}
