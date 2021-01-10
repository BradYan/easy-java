package a01$Java语言核心技术入门.c02章$基础概念和语法.s08节$构造方法;

public class BookThisReference {
    String name; //书名，类型为字符串String，默认值为null
    String author; //作者，类型为字符串String，默认值为null
    int rank; //排名，类型为整型int，默认值为0
    String brief;//书名简介 , 类型为字符串String
    int totalRead;//本书总阅读人数， 类型为整型 int, 默认值为0
    int totalComment; //本书总评价数， 类型为整型 int
    double score; //本书平均评分 ，类型为小数， double类型。

    public BookThisReference(String name, String author, double score, int rank){
        this.name = name;
        this.author = author;
        this.score = score;
        this.rank = rank;
        this.printInfo();//这里添加this没必要。确实可以这么用。
    }

    public void printInfo(){
        printBook(this);//该方法所在的对象this，作为printBook的参数传递进去。
    }
    public void printBook(BookThisReference book){
        System.out.println("书名："+book.name+",作者："+book.author+",评分："+book.score);
    }

    public static void main(String[] args) {
        //this可以将自己作为对象引用进行参数传递。
        BookThisReference book = new BookThisReference("经济学原理第七版","曼昆",9.9,1);
        System.out.println("初始化调用该方法后，再次调用，打印信息。");
        book.printInfo();
    }
}
