package com.wmhou.chapter5;

/**
 * Description:类的基础
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Students {

    //属性：学号
    private int studentId;
    //属性：姓名
    private String name;
    //属性：年龄
    private int age;
    //属性：籍贯
    private String address;
    //属性：专业
    private String subject;
    //属性：爱好
    private String hobbies;

    //有参构造器
    public Students(int studentId, String name, String subject)
    {
        this.studentId = studentId;
        this.name = name;
        this.subject = subject;
    }

    //无参构造器
    public Students()
    {

    }

    public void study(int studentId, String name, String subject)
    {
        System.out.println("学号：" + studentId + "；姓名：" + name + "专业：" + subject + "");
    }

    public void play(int studentId, String name, String hobbies)
    {
        this.study(studentId, name, hobbies);
        System.out.println("学号：" + studentId + "；姓名：" + name + "专业：" + hobbies + "");
    }


    public static void main(String[] args)
    {
        //无参构造器
        Students studentA = new Students();

        //有参构造器
        Students studentB = new Students(199108, "Da_师兄","软件工程");

        //一个引用多个对象
        studentA = studentB;

        //多个引用一个对象：studentC和studentD都指向同一个对象
        Students studentC = studentA;
        Students studentD = studentA;
    }
}
