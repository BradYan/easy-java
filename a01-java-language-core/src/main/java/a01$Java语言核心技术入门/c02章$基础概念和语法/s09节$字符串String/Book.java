package a01$Java语言核心技术入门.c02章$基础概念和语法.s09节$字符串String;

public class Book {
    String name; //书名，类型为字符串String，默认值为null
    String author; //作者，类型为字符串String，默认值为null
    int rank; //排名，类型为整型int，默认值为0
    String brief;//书名简介 , 类型为字符串String
    int totalRead;//本书总阅读人数， 类型为整型 int, 默认值为0
    int totalComment; //本书总评价数， 类型为整型 int
    double score; //本书平均评分 ，类型为小数， double类型。

    public Book(String name, String author, double score){
        this.name = name;//等号左边的 this.name 是指当前对象具有的变量 name，等号右边的 name 表示参数传递过来的数值。
        this.author = author;
        this.score = score;
    }
    public Book(String name){
//        System.out.println("打开该注释，会报错，this()构造方法调用必须在第一行");
        this(name,null,0.0);
    }
}
