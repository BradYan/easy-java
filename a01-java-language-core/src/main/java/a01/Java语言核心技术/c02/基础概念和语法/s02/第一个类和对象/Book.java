package a01.Java语言核心技术.c02.基础概念和语法.s02.第一个类和对象;

 class Book{

    String name; //书名
    String author; //作者
    int rank; //排名

     public static void main(String[] args) {
         new Book();//如果不将实例化的对象赋值，它就是孤魂野鬼，找不到归属。其它代码想用它也没办法。因为不知道它叫啥。所以要起个名字，能够引用到它。
         Book book = new Book();
         Book book2 = new Book();
         Book book3 = new Book();
     }

}
