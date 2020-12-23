package a01$Java语言核心技术入门.c02章$基础概念和语法.s03节$标识符和编程规范;


import a01.Java语言核心技术.c02.基础概念和语法.s02.第一个类和对象.Book;

import java.time.LocalDateTime;
import java.util.Date;

public class NameRules { //类的命名，大写字母开头，多个字母，后面的字母同样大写字母开头。
    final static double CIRCLE_PI = 3.1415926; //定义了一个常量，圆周率。常量的命名都是大写字母，表明含义。
    String variableDefinitionWay; //变量的命名规则。以小写字母开头。

    //方法的命名规则， 以及参数的命名规则。
    public void functionDefinitionWay(String argDefinitionWay) {
        System.out.println("方法以小写字母开头。");
        System.out.println("参数以小写字母开头。");
    }

    public static void main(String[] args) {
        System.out.println("测试import，当前时间:" + new Date());
        System.out.println("测试import，当前时间(新方式):" + LocalDateTime.now());
        Book bookHongLouMeng = new Book();//有时候变量名，实例名命名按照需要，定义的有意义，而不需要额外注释。
        System.out.println("测试import，打印当前对象的内存地址:" + bookHongLouMeng);
    }
}
