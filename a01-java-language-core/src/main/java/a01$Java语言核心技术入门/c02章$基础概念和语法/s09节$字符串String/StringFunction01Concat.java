package a01$Java语言核心技术入门.c02章$基础概念和语法.s09节$字符串String;

public class StringFunction01Concat {

    public static void main(String[] args) {
        // 字符串的拼接 + ，以及concat()方法
        String str1 = "Hello";
        String str2 = "Java";
        String str3 = str1 + str2 + " world";
        String str4 = str1.concat(str2).concat(" world");
        System.out.println("连接运算符+方式："+str3);
        System.out.println("concat()方法："+str4);

        Book weiCheng = new Book("围城","钱钟书",9.1);
        System.out.println("将书的信息拼接，从后端服务器返回到前端用户端。");//后端服务器的搭建我们会在后面章节学习。
        System.out.println("书名："+weiCheng.name +",作者："+ weiCheng.author +"，评分："+ weiCheng.score);
        System.out.println("以下为连接运算符+和concat()方法混用。再次提示，String的拼接操作，会自动将非String类型转换为String类型，比如下面的评分。");
        System.out.println(("书名："+weiCheng.name).concat(",作者："+ weiCheng.author).concat("，评分："+ weiCheng.score));
    }
}
