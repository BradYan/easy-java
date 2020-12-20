# 打印HelloWorld

[toc]

## 一 Maven项目文件结构

上一节我们学习了创建新的Maven项目，或者打开一个已存在的Maven项目。

如下图的标记1，2，3，4.

### 1.1 Project 的查看项目

标记1，选择Project方式，可以查看整个项目的文件结构。

### 1.2 项目名称和项目路径

标记2，可以看到顶级目录的项目名称，和项目的文件夹路径。该项目名称也可以称作父项目。

### 1.3 子项目Module

标记3， 是子项目，一个父项目里可以新建很多子项目，按照业务功能需要。子项目的文件目录结构和标记4一样。仅仅是从属关系上继承了一些父项目的属性配置。

### 1.4 Maven项目文件结构

标记4，是Maven项目代码编写和资源配置的文件夹结构。都是存放在src文件夹下。

其中有main目录和test目录。main目录下是写实际生产线上运行的代码和资源文件。test目录下是编写测试用例的代码和资源文件。

java代码都是编写在java文件夹下面。

非java代码都是编写在resources文件夹下面。

![](https://upload-images.jianshu.io/upload_images/23305353-0c2fab14868b7a96.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 二 第一个Java程序

基于我们新建的HelloWorld项目，我们开始写第一个Java程序。

### 2.1 新建Class类文件

左键点击小三角,1,2,3. 右键 java包 -> New -> Java Class

![image-20200616235759858](https://upload-images.jianshu.io/upload_images/23305353-722174210f272f39.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 2.2 输入类名字 

在下图弹出框中，输入Hello,作为类名，确定.

注意观察，最简单的类，写法，只有如下代码：

(以下备注内容，是代码的注释，用双左斜杠表示，不属于代码，不影响编译和执行)

```java
public class Hello { //备注：不同的类，名字不同。都是由class修饰。加上一对花括号。

}
```



![idea_11_02](https://upload-images.jianshu.io/upload_images/23305353-cb0ec87f3e23ada7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 2.3 在Hello类文件中写代码

#### 2.3.1 程序主入口main函数

所有的程序入口都是main函数,不管多么复杂的项目,在独立运行作为服务进程的时候，只有一个main入口.

在class类文件Hello的花括号中输入快捷键psvm,回车. 就自动得到main函数的代码. 


![idea_11_03](https://upload-images.jianshu.io/upload_images/23305353-253db2c853e95d07.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

你也可以手工编写如下main函数内容。注意观察main函数写法。
```java
public class Hello {

    public static void main(String[] args) {//备注：main函数，是固定写法。
    }
}
```

#### 2.3.2 编写println打印

在main函数的花括号输入快捷键sout,回车. 再输入如下内容. 注意严格区分大小写的。

```java
public class Hello {

    public static void main(String[] args) {
        System.out.println("hello world. Mr/Ms."); 
        //备注：System.out.println是java自带的函数。用于打印字符串到控制台。字符串由英文字符的双引号括起来。
    }
}
```

![idea_11_04](https://upload-images.jianshu.io/upload_images/23305353-88b4c1084724e2b8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 三 运行第一个Java程序

### 3.1 尝试运行

如下图，标记1，2，右键Hello类文件 ->  Run 'Hello.main()'

你可能会得到如下一张图的错误.

![idea_11_05](https://upload-images.jianshu.io/upload_images/23305353-6ffe83d9ae6036a2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 3.2 Error:java:错误:不支持发行版本5

同时你会看到多了一个目录target. Maven项目默认在target目录下，将我们编写的Java代码，调用JDK编译成可以执行的class文件。

这个错误的意思就是你想用版本14的java,生成编译版本为5的字节码.

因为版本相差太远，JDK 版本14已经不支持版本为5的字节码生成。

修改方法见下一步.

![idea_11_06](https://upload-images.jianshu.io/upload_images/23305353-544853bfa1be9a98.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 3.3 编写设置Language level

Project Structures配置Language level，这个的作用是，告诉开发工具，你编写的代码是符合指定版本的开发语法的。

换个说法，如果你这里选择的版本太低，比如版本5，而你在项目中开发时，用到了更高版本的语法，那么就会报错。

如下图标记1，2，3所示。

1. 点击左上角 File --> Project Structures 

2. Modules默认是继承Project的Language level设置. 也可以单独对Modules设置。点击Modules  -->选中 hello-world.

3. 选择Project default (14-Switch expressions)  , 意思就是跟随Project的 Language level设置.也可以单独设置。

4. 确定/Apply.
5. 再次运行,你会发现还是不行.还有一处需要设置.

![idea_11_07](https://upload-images.jianshu.io/upload_images/23305353-41b4328735a26c49.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 3.4 编译设置bytecode版本

IDEA Settings中，设置Java编译时生成class文件的bytecode版本。它和Language level作用的地方有区别。

1. 点击左上角 File --> settings (注意在Mac中不叫settings,叫Preference,位置也不同.如紧随其下的一张图.)

2. 点击 Build,Execution,Deployment --> Compiler --> Java Compiler

3. 看到1.5, 因为历史原因. 5就是1.5.  Java版本1.8 就是8. 往后直接是9,10,11,12,13,14....
   (如果看不到Hello-world,可能是没有运行过,或者右边一点点可以看到(+-)按钮,添加. 

   Mac中如下图则是在左下一点点有(+-)按钮.)
   这里我们可以选择你希望的目标字节码版本.我们设置为空. 就是 Same as language level.

4. Ok/Apply .
5. 此时运行代码成功。

![idea_12](https://upload-images.jianshu.io/upload_images/23305353-2a928aae2b6ad3b3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![mac_idea.png](https://upload-images.jianshu.io/upload_images/23305353-23ac6b7f34da7c14.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



### 3.5 打印HelloWorld

再次运行,如下图标记1，2，3

你会看到Maven调用了JDK将标记1的Hello.java文件,在标记2的target目录下，编译生成了 Hello.class文件.

标记3，就是Java虚拟机执行该(.class)文件,在控制台打印出代码里的那段字符串.

![idea_13](https://upload-images.jianshu.io/upload_images/23305353-23b143b80f5f3080.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

### 3.6  Java程序的执行过程

JDK（Java Development Kid，Java 开发开源工具包），是针对 Java 开发人员的产品，是整个 Java 的核心，包括了 Java 运行环境 JRE、Java 工具和 Java 基础类库。
JRE（Java Runtime Environment，Java 运行环境）是运行 JAVA 程序所必须的环境的集合，包含 JVM 标准实现及 Java 核心类库。
JVM（Java Virtual Machine，Java 虚拟机）是整个 Java 实现跨平台的最核心的部分。

**Java 程序的运行必须经过编写、编译和运行 3 个步骤**。

1. 编写：是指在 Java 开发环境中进行程序代码的输入，最终形成后缀名为 .java 的 Java 源文件。
2. 编译：是指使用 Java 编译器对源文件进行错误排査的过程，编译后将生成后缀名为 .class 的字节码文件，不像C语言那样生成可执行文件。
3. 运行：是指使用 Java 解释器将字节码文件翻译成机器代码，执行并显示结果。

Java 程序运行流程如图 1 所示。

![01.png](https://upload-images.jianshu.io/upload_images/23305353-b7d553f7c56d7641.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



**字节码文件是一种和任何具体机器环境及操作系统环境无关的中间代码。它是一种二进制文件，是 Java 源文件由 Java 编译器编译后生成的目标代码文件。**编程人员和计算机都无法直接读懂字节码文件，它必须由专用的 Java 解释器来解释执行，因此 Java 是一种在编译基础上进行解释运行的语言。

Java 解释器负责将字节码文件翻译成具体硬件环境和操作系统平台下的机器代码，以便执行。因此 Java 程序不能直接运行在现有的操作系统平台上，它必须运行在被称为 Java 虚拟机的软件平台之上。

**Java 虚拟机（JVM）是运行 Java 程序的软件环境，Java 解释器是 Java 虚拟机的一部分。**在运行 Java 程序时，首先会启动 JVM，然后由它来负责解释执行 Java 的字节码程序，并且 Java 字节码程序只能运行于 JVM 之上。这样利用 JVM 就可以把 Java 字节码程序和具体的硬件平台以及操作系统环境分隔开来，只要在不同的计算机上安装了针对特定平台的 JVM，Java 程序就可以运行，而不用考虑当前具体的硬件平台及操作系统环境，也不用考虑字节码文件是在何种平台上生成的。

JVM 把这种不同软、硬件平台的具体差别隐藏起来，从而实现了真正的二进制代码级的跨平台移植。**JVM 是 Java 平台架构的基础，Java 的跨平台特性正是通过在 JVM 中运行 Java 程序实现的**。Java 的这种运行机制可以通过图 2 来说明。


![02.png](https://upload-images.jianshu.io/upload_images/23305353-cdaf5d4a8b3ab724.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



Java 语言这种“一次编写，到处运行”的方式，有效地解决了目前大多数高级程序设计语言需要针对不同系统来编译产生不同机器代码的问题，即硬件环境和操作平台的异构问题，大大降低了程序开发、维护和管理的开销。

提示：Java 程序通过 JVM 可以实现跨平台特性，但 JVM 是不跨平台的。也就是说，不同操作系统之上的 JVM 是不同的，Windows 平台之上的 JVM 不能用在 Linux 平台，反之亦然。

### 3.7 新建package

在easy-java项目中，你可能会看到如下的目录，它们在Java项目中，被称为package，中文叫“包”。在系统里，其实就是文件夹。

在Java项目中，它的作用是对不同功能作用的Java文件进行分类，便于管理。

创建package的方式如下图标记1，2.

标记3，在生成class文件的时候，它们也会生成对应的package。

![package创建](https://upload-images.jianshu.io/upload_images/23305353-d4d4b1028484fa94.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 文章和项目开源地址

一起学习，Java最简单易懂的零基础入门，答疑解惑，关注点赞`github`开源：[https://github.com/BradYan/easy-java](https://github.com/BradYan/easy-java)
