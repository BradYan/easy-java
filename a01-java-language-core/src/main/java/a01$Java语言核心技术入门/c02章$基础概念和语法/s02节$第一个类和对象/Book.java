package a01$Java语言核心技术入门.c02章$基础概念和语法.s02节$第一个类和对象;

public class Book{

     String name; //书名，类型为字符串String，默认值为null
     String author; //作者，类型为字符串String，默认值为null
     int rank; //排名，类型为整型int，默认值为0

     public static void main(String[] args) {
         new Book();//如果不将实例化的对象赋值，它就是孤魂野鬼，找不到归属。其它代码想用它也没办法。因为不知道它叫啥。所以要起个名字，能够引用到它。
         Book book = new Book();//实例化了一本书,赋值给book
         Book book2 = new Book();//实例化了一本书,赋值给book2
         Book book3 = new Book();//实例化了一本书,赋值给book3

         System.out.println("----------------以下内容查看实例化后对象的数据----------------");
         System.out.println("book 对象,书名:"+book.name+",作者:"+book.author+",排名:"+book.rank);
         System.out.println("book2对象,书名:"+book2.name+",作者:"+book2.author+",排名:"+book2.rank);
         System.out.println("book3对象,书名:"+book3.name+",作者:"+book3.author+",排名:"+book3.rank);

     }

}
