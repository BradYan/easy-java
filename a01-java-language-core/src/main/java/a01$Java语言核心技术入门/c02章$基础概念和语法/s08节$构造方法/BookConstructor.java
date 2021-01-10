package a01$Java语言核心技术入门.c02章$基础概念和语法.s08节$构造方法;

public class BookConstructor {

    String name; //书名，类型为字符串String，默认值为null
    String author; //作者，类型为字符串String，默认值为null
    int rank; //排名，类型为整型int，默认值为0
    String brief;//书名简介 , 类型为字符串String
    int totalRead;//本书总阅读人数， 类型为整型 int, 默认值为0
    int totalComment; //本书总评价数， 类型为整型 int
    double score; //本书平均评分 ，类型为小数， double类型。

    public BookConstructor(){
        System.out.println("无参构造方法被调用。");
        score = 100.00;//设置评分默认值为100分。
        System.out.println("构造方法里可以对特殊变量赋值。");
    }

    public BookConstructor(String nameArg, String authorArg){
        System.out.println("两个参数的有参构造方法被调用。");
        name = nameArg;
        author = authorArg;
    }

    public BookConstructor(String nameArg, String authorArg, int rankArg){
        System.out.println("三个参数的有参构造方法被调用。");
        name = nameArg;
        author = authorArg;
        rank = rankArg;
    }

    public static void main(String[] args) {
        BookConstructor bookEmpty = new BookConstructor();
        System.out.println("默认构造方法，给书评分赋值初始化为："+bookEmpty.score);
        //从数据库或者其它地方获取到的数据，按照业务设计需要，给对象初始化赋值。
        BookConstructor bookHongLouMeng = new BookConstructor("红楼梦","曹雪芹");
        System.out.println("两个参数的构造方法，赋值初始化。书名:"+bookHongLouMeng.name+",作者："+bookHongLouMeng.author);
        BookConstructor bookWeiCheng = new BookConstructor("围城","钱钟书",3);
        System.out.println("三个参数的构造方法，赋值初始化。书名:"+bookWeiCheng.name+",作者："+bookWeiCheng.author+",排名："+bookWeiCheng.rank);

    }
}
