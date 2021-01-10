package a01$Java语言核心技术入门.c02章$基础概念和语法.s08节$构造方法;

public class BookThis {
    String name; //书名，类型为字符串String，默认值为null
    String author; //作者，类型为字符串String，默认值为null
    int rank; //排名，类型为整型int，默认值为0
    String brief;//书名简介 , 类型为字符串String
    int totalRead;//本书总阅读人数， 类型为整型 int, 默认值为0
    int totalComment; //本书总评价数， 类型为整型 int
    double score; //本书平均评分 ，类型为小数， double类型。

    public BookThis(String name,String author,double score){
        this.name = name;//等号左边的 this.name 是指当前对象具有的变量 name，等号右边的 name 表示参数传递过来的数值。
        this.author = author;
        this.score = score;
    }
    public BookThis(String name){
//        System.out.println("打开该注释，会报错，this()构造方法调用必须在第一行");
        this(name,null,0.0);
        System.out.println("构造方法执行结束。");
    }

    public static void main(String[] args) {
        //在构造方法里面使用this关键字，代码变得简洁，开发工具也可以快速提示输入。
        BookThis book = new BookThis("经济学原理第七版","曼昆",9.9);

        //this()，调用该类的其它构造方法，必须在第一行。
        BookThis bookThis = new BookThis("经济学原理第七版");

    }
}
