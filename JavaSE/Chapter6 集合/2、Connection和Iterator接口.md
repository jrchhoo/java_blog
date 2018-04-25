## 2、Connection和Iterator接口

[上篇——Chapter6：1、集合框架概述](1、集合框架概述.md)

### Collection接口：

Connection接口是List、Set、Queue接口的父接口，Connection接口定义的一些操作结合元素的方法，它的子接口自然也可以使用，我们看一下Connection里面有些什么通用方法：

| **方法**                           | **描述**                                       |
| ---------------------------------- | ---------------------------------------------- |
| Boolean add(Object o)              | 向集合中添加一个对象的引用                     |
| Void clear()                       | 删除集合中的所有对象，即不再持有这些对象的引用 |
| Boolean contains(Object o)         | 判断在集合中是否持有特定对象的引用             |
| Boolean isEmpty()                  | 判断集合是否为空                               |
| Iterator iterator()                | 返回一个Iterator对象，可用它来遍历集合中的元素 |
| Boolean remove(Object o)           | 从集合中删除一个对象的引用                     |
| Boolean retainAll(Collection<?> c) | 保留集合中的指定内容                           |
| Int size()                         | 返回集合中元素的数目                           |
| Object[] toArray()                 | 返回一个数组，该数组包含集合中的所有元素       |
| Boolean equals(Object o)           | 对象比较                                       |
| Int hashCode()                     | 返回hash码                                     |

这些方法来源与API文档，用时查阅即可，我们写一个小程序来演示一下这些方法：

```java
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
```

输出结果是：

```java
collection集合中元素个数为：2
collection集合中元素个数为：1
collection集合中是否包含"添加元素"字符串：true
collection集合中的元素是：[元素, 5]
collection1集合中的元素是：[HashSet元素, 5, 元素]
collection1集合中的元素个数是：0
```

以上演示了Collection接口中定义的一些常用方法：有添加元素、删除元素、返回个数、清空等，当我们直接打印的时候，会输出[..., ..., ...]这样的数据结构，很显然是有重写了toString()方法，那么如果我们要遍历集合元素呢？

```java
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
    }
}
```

以上两种遍历方式都可以输出Collection集合的所有元素，我们看到Collection中放入的元素默认都是Object类型，我们通常不会这样做，一般情况下都会使用泛型来约束集合中元素的类型。当然除了这种方法，我们还可以直接使用for循环，或者下面我们要说的另一个接口Iterator来进行迭代：

### Iterator接口：

Iterator接口同样是集合框架中存在的接口，他是独立于Collection和Map的另一个接口，也叫迭代器，主要用于遍历集合元素，Iterator接口定义了四个方法，我们用一个小程序演示一下：

```java
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
```

Iterator接口的方法比较简单，它主要的用途就是遍历集合。

[本节代码路径](https://github.com/wmhou/java_blog/tree/master/JavaSE/JavaCode/src/com/wmhou/chapter6)

[下篇——Chapter6：2、Connection和Iterator接口](3、List接口.md)

