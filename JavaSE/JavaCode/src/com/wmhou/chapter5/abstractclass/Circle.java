package com.wmhou.chapter5.abstractclass;

/**
 * Description:
 * <br/>网站：<a href="https://github.com/wmhou/java_blog">Java_blog on Github</a>
 * <br/>Program Name: Java_blog
 * <br/>Date:2018-03-01
 *
 * @author 侯伟民
 * @version 1.0
 */
public class Circle extends Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }

    @Override
    public double calPerimeter() {
        double perimeter = 2 * Math.PI * r;
        System.out.println("半径为" + r + "的圆周长 = " + perimeter);
        return perimeter;
    }

    @Override
    public double calArea() {
        double area = Math.PI * Math.pow(r, 2);
        System.out.println("半径为" + r + "的圆面积 = " + area);
        return area;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.calPerimeter();
        circle.calArea();

        Shape shape = new Circle();
        shape.color();
    }
}
