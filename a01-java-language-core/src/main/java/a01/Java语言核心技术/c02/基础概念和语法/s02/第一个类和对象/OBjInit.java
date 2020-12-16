package a01.Java语言核心技术.c02.基础概念和语法.s02.第一个类和对象;

public class OBjInit {
//该类没有属性，只有main方法。
    public static void main(String[] args) {
        //我们之前讲过Book类是public的。所以在ObjectInit这个类中也是可以使用这个类的。
        Book book = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("----------------以下内容为对象赋值=----------------");
        System.out.println("给book 对象赋值，书名，作者，排名");
        book.name = "围城";
        book.author = "钱钟书";
        book.rank = 3;

        System.out.println("给book2 对象赋值，书名，作者，排名");
        book2.name = "白鹿原";
        book2.author = "陈忠实";
        book2.rank = 4;

        System.out.println("给book3 对象赋值，书名，作者，排名");
        book3.name = "红楼梦";
        book3.author = "曹雪芹";
        book3.rank = 5;

        System.out.println("----------------以下内容查看实例化后对象的数据----------------");
        System.out.println("book 对象,书名:"+book.name+",作者:"+book.author+",排名:"+book.rank);
        System.out.println("book2对象,书名:"+book2.name+",作者:"+book2.author+",排名:"+book2.rank);
        System.out.println("book3对象,书名:"+book3.name+",作者:"+book3.author+",排名:"+book3.rank);
    }
}
