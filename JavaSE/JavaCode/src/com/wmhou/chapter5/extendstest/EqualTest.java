package com.wmhou.chapter5.extendstest;

/**
 * Description:重写Equals方法的必要性，以及和==的区别
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-25
 *
 * @author 侯伟民
 * @version 1.0
 */
public class EqualTest {
    private int id;

    public EqualTest(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof EqualTest) {
            EqualTest test = (EqualTest) o;
            return this.id == test.id;
        }
        return false;
    }

    @Override
    public String toString() {
        return "EqualTest{" + "id=" + id + "}";
    }

    public static void main(String[] args) {
        EqualTest e1 = new EqualTest(1);
        EqualTest e2 = new EqualTest(1);

        System.out.println(e1.equals(e2));
        System.out.println(e1 == e2);
        System.out.println(e1.toString());

    }
}
