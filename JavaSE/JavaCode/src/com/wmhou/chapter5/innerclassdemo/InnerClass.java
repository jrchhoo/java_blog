package com.wmhou.chapter5.innerclassdemo;

/**
 * Description:内部类
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-07
 *
 * @author 侯伟民
 * @version 1.0
 */
public class InnerClass {
    private int id;
    private String name;

    public void test() {
        ClassA classA = new ClassA();
        System.out.println("外部类普通方法");
        classA.innerMethod(01, "内部类");
    }

    public static void testForStatic() {
        System.out.println("外部类静态方法");
    }

    private class ClassA {
        public void innerMethod(int id, String name) {
            System.out.println(id + "_" + name);
        }
    }

    static class ClassB{
        public static void staticInnerMethod(){
            System.out.println("静态内部类");
        }
        public void staticInnerMethodB(){
            // test(); //编译失败，静态内部类不能访问外部类普通方法
            testForStatic();
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.test();
        InnerClass.ClassB.staticInnerMethod();
    }
    

}

