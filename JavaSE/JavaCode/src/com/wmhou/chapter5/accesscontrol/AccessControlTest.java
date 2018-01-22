package com.wmhou.chapter5.accesscontrol;

import com.wmhou.chapter4.ArrayTest;

/**
 * Description:测试访问控制符和import
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-1-18
 *
 * @author 侯伟民
 * @version 1.0
 */
public class AccessControlTest {
    public static void main(String[] args)
    {
        AccessControl control = new AccessControl();
        control.setName("name测试");
        String name = control.getName();
        System.out.println("name：" + name);

        com.wmhou.chapter4.ArrayTest test = new com.wmhou.chapter4.ArrayTest();
    }
}
