package com.wmhou.chapter5.extendstest;

/**
 * Description:继承之构造方法
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-2-20
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Manager extends Employee {

    private double reward;

    public Manager() {
        this(2000);
    }

    public Manager(double reward) {
        this.reward = reward;
    }

    public Manager(String id, String name, String department, double reward) {
        super(id, name, department);
        this.reward = reward;
    }

    public static void main(String[] args) {
        Manager managerA = new Manager();

        Manager managerB = new Manager(20000);

        Manager managerC = new Manager("0002", "赵子龙", "集成工具部", 30000);
    }

}
