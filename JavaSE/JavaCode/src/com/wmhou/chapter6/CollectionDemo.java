package com.wmhou.chapter6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * Description:Collection接口方法
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date: 2018-04-25
 *
 * @author 侯伟民
 * @version 1.0
 */
public class CollectionDemo {

    public static void main(String[] args) {

        Collection collection = new ArrayList();

        collection.add("元素");
        collection.add(3);
        System.out.println("collection集合中元素个数为：" + collection.size());

        collection.remove(3);
        System.out.println("collection集合中元素个数为：" + collection.size());

        System.out.println("collection集合中是否包含\"添加元素\"字符串：" + collection.contains("元素"));

        collection.add(5);
        System.out.println("collection集合中的元素是：" + collection);

        Collection collection1 = new HashSet();
        collection1.add("HashSet元素");
        collection1.addAll(collection);
        System.out.println("collection1集合中的元素是：" + collection1);

        collection1.clear();
        System.out.println("collection1集合中的元素个数是：" + collection1.size());

    }
}
