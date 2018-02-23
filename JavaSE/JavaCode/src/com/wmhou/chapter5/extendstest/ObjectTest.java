package com.wmhou.chapter5.extendstest;

import java.util.Objects;

/**
 * Description:Object类的常用方法示例
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-22
 *
 * @author 侯伟民
 * @version 1.0
 */
public class ObjectTest {
     private int id;

    @Override
    public boolean equals(Object o) {
        if (o instanceof ObjectTest) {
            ObjectTest test = (ObjectTest) o;
            return this.id == test.id;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public static void main(String[] args) {
        ObjectTest test1 = new ObjectTest();
        test1.id = 1;
        ObjectTest test2 = new ObjectTest();
        test1.id = 1;

        System.out.println(test1.equals(test1));
        System.out.println(test1 == test2);


    }
}
