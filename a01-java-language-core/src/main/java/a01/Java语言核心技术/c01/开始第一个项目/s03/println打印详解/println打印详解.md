# print打印详解

[toc]

## 一 `println`打印

上一节我们学习了如何在IDEA中运行一个最简单的项目，并打印一段字符串。

这一节将打印字符串进行一次详细解释，避免以后前期学习遇到调试的问题。

`System.out.println`是Java自带的往控制台打印字符串的方法。

右键run运行`PrintlnExplain.java`代码。

### 1.1 打印字符串

```java
System.out.println("打印字符串,任意内容。");
```

### 1.2 打印字符串拼接

```java
System.out.println("打印字符串拼接:"+"abcde");
System.out.println("打印字符串拼接:"+"abc"+"defg等各种字符");
```

### 1.3 字符串拼接数字

```java
System.out.println("打印字符串和整数字:"+123456);
System.out.println("打印字符串和小数:"+3.1415926);
```

### 1.4 字符串拼接多个数字

注意观察打印结果。

```java
System.out.println("打印字符串和多个数字:"+3+7+3+7);//注意观察打印结果。
```

字符串是按照从左往右的顺序打印的，当遇到3，7，是将它们看作字符处理。

### 1.5 字符串改变优先级

注意观察打印结果。

```java
System.out.println("打印字符串和数字:"+3*7+3*7); //用乘号* 改变了优先级。

System.out.println("打印字符串和数字:"+(3+7)+(3+7)); //用括号() 改变了优先级。
```

此处用乘号和括号改变了优先级，在打印之前先进行了计算操作。但并未改变之后的加号优先级，所以如果需要继续计算，需要再添加括号改变优先级。
```java
System.out.println("打印字符串和数字:"+(3*7+3*7)); //用乘号*和括号 改变了优先级。

System.out.println("打印字符串和数字:"+((3+7)+(3+7))); //用多个括号() 改变了优先级。
```

### 1.6 优先级的注意

**`关于优先级，后面会介绍，简单的一点就是，当不确定的时候，就用括号括起来确保按照逻辑执行代码。`**

## 二 `print`打印

`System.out.print`方法和`System.out.println`方法的区别就是后者打印之后会换行。前者不会换行。

```java
System.out.print("打印字符串这里不换行1。");
System.out.println("打印字符串这里换行2。");
System.out.print("打印字符串这里不换行3。");
System.out.println("打印字符串这里换行4。");
```

## 三 附代码

```java

public class PrintlnExplain {

    public static void main(String[] args) {
        System.out.println("打印字符串");
        System.out.println("打印字符串拼接:"+"abcde");
        System.out.println("打印字符串拼接:"+"abcde"+"fghijk等各种字符");
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和整数字:"+123456);
        System.out.println("打印字符串和小数:"+3.1415926);
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和多个数字:"+3+7+3+7);
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和数字--乘号:"+3*7+3*7); //用乘号* 改变了优先级。

        System.out.println("打印字符串和数字--括号:"+(3+7)+(3+7)); //用括号() 改变了优先级。
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和数字--乘号括号:"+(3*7+3*7)); //用乘号*和括号 改变了优先级。

        System.out.println("打印字符串和数字--多个括号:"+((3+7)+(3+7))); //用多个括号() 改变了优先级。
        System.out.println("-----------------------------------------------------------");
        System.out.print("打印字符串这里不换行1。");
        System.out.println("打印字符串这里换行2。");
        System.out.print("打印字符串这里不换行3。");
        System.out.println("打印字符串这里换行4。");
    }
}
```



## 四 打印方法说明

在学习的过程中，一般都是直接调用该方法进行打印，该方法只能打印在控制台上，打印出运行的项目中的状态信息，对象和变量的值内容。

在线上生产环境中，是有专门的日志工具，我们在代码里使用该工具打印出项目运行中的状态信息，和值内容，打印到指定的文件里。用于调试，追踪，定位线上问题。


## 文章和项目开源地址

关注点赞`github`开源：[https://github.com/BradYan/easy-java](https://github.com/BradYan/easy-java)

