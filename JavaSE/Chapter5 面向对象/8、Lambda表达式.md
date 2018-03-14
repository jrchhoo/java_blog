### 8、Lambda表达式

[上篇——Chapter5：7、抽象类、接口和内部类](7、抽象类、接口和内部类.md)

Lambda表达式是Java8的新特性，它支持将代码块作为参数进行传递，这个特性我们之前是没有接触过的，在Java中定义的方法不可能完全独立，也不能将方法作为参数或者返回一个方法，Lambda可以做到这一点。

#### Lambda简介

简单来说，Lambda表达式就是没有声明的方法，也就是说没有访问修饰符、返回值和名字。当某个方法只使用一次而且定义很简短，就不必在类中再去定义一个这样的方法了。

它的语法结构是（argument）->（body）语法书写，如下：

```java
(arg1, arg2, ...) -> {body}
(type1 arg1, type2 arg2, ...) -> {body}
```

#### Lambda表达式结构

根据上面语法示例看一下Lambda表达式的结构：

- 一个表达式可以有0个或者多个参数；
- 参数类型可以明确声明，也可以根据上下文推断；
- 参数包含在小括号之内，相互之间用逗号分割；
- 只有一个参数且类型可以根据上下文得到时，小括号可以省略；
- 当表达式主体中只有一条语句，大括号可以省略，如果有多条，大括号必须存在。

#### Lambda表达式与函数式接口

在Java中，函数式接口是只包含一个抽象方法声明的接口，例如```java.lang.Runnable```接口，该接口中只声明了一个方法```void run()```，如果要去实现这个接口，进而实例化对象，我们通常会使用implements的方式，此外还可以使用匿名内部类来实例化一个对象，而使用Lambda则更加简便，如下

```java
public class LambdaDemoImpl implements Runnable{

    @Override
    public void run() {

    }

    public static void test(Runnable runnable){
        runnable.run();
    }

    public static void main(String[] args) {
        
        // 匿名内部类
        test(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anonymous class");
            }
        });

		// 使用Lambda表达式
        test( () -> System.out.println("Lambda expression"));
    }
}
```

执行输出：

```java
Anonymous class
Lambda expression
```

上面的例子里，我们使用Runnable函数式接口并与 Lambda 表达式一起使用。test() 方法现在可以将 Lambda 表达式作为参数。多看几个例子：

#### Lambda表达式举例

线程初始化：

```java
//原有方法:
new Thread(new Runnable() {
@Override
public void run() {
    System.out.println("Hello thread");
}
}).start();

//Lambda表达式:
new Thread(
	() -> System.out.println("Hello thread")
).start();
```

再看一个更神奇的例子：

```java
    public static void main(String[] args) {
        
        // 常规方法
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 9);
        for (Integer i: list) {
            System.out.println(i);
        }
		
        //Lambda表达式
        list.forEach(i -> System.out.println(i));

        // ：：双冒号操作符将一个常规方法转化为Lambda表达式
        list.forEach(System.out::println);
    }
```

再来一个例子，从实例中学习才是最有效的

```java
public interface LambdaInter<T> {

    boolean exec (T t);
}
```

```java
public class LambdaDemo1 {

    public static void test(List<Integer> list, LambdaInter<Integer> lambdaInter) {
        for (Integer n : list) {
            if (lambdaInter.exec(n)) {
                System.out.print( n + " ");
            }
        }
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        System.out.print("打印所有数：");
        test(list, (n) -> true);

        System.out.print("不打印：");
        test(list, (n) -> false);

        System.out.print("偶数：");
        test(list, (n) -> n % 2 == 0);
    }

}
```

输出结果是：

```java
打印所有数：1 2 3 4 5 6 7 
不打印：
偶数：2 4 6 
```

上面的实例中我们首先定义了一个函数式接口，提供一个返回boolean的方法，在一个普通的Java类中去使用这个接口，Lambda根据上下文得出参数类型，我们也可以自己定义一些代码逻辑去实现不同的功能。

Lambda在笔者经历的项目中，主要应用还是在Runable接口的使用中，其他方面并不是很多，而且，在有些团队中也不会允许使用Lambda表达式，有时候可能会影响代码可读性，但是Lambda作为Java8新特性，最起码要知道它的作用，读到相关的代码也不至于完全看不明白。

[本节代码路径](https://github.com/wmhou/java_blog/tree/master/JavaSE/JavaCode/src/com/wmhou/chapter5/lambdademo)

[下篇——Chapter5：9、正则表达式](9、正则表达式.md)



