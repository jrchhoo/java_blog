package com.wmhou.chapter6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Description:遍历Collection集合的方法：
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date: 2018-04-25
 *
 * @author 侯伟民
 * @version 1.0
 */
public class CollectionEach {

    public static void main(String[] args) {
        Collection computer = new ArrayList();
        computer.add("Dell");
        computer.add("ThinkPad");
        computer.add("MacBook");
        computer.add("Huawei");

        // foreach循环遍历元素
        for (Object str : computer) {
            System.out.println(str);
        }

        // lambda表达式foreach循环遍历元素
        computer.forEach(obj -> System.out.println(obj));

        // 使用Iterator迭代器遍历集合
        Iterator iterator = computer.iterator();

        // forEachRemaining方法：java8提供使用Lambda表达式遍历集合
        iterator.forEachRemaining(obj -> System.out.println("迭代集合元素：" + obj));

        // hasNext:返回是否还有下一个元素的判断
        while (iterator.hasNext()) {
            // next:返回集合中的下一个元素
            System.out.println(iterator.next());
            if (iterator.next().equals("MacBook")) {
                // remove:删除上一次next方法返回的元素
                iterator.remove();
            }
        }

    }
}
