package a01$Java语言核心技术入门.c02章$基础概念和语法.s09节$字符串String;

public class StringFunction02Equals {

    public static void main(String[] args) {
        // equals判断字符串是否内容相同
        String str1 = "Hello Java";
        String str2 = new String("Hello Java");
        System.out.println("判定字符串是否值相同:"+str1.equals(str2));
        System.out.println("判定字符串是否值相同:"+"HelloWorld".equals(str2));
        //应用如下。如图所示，搜索书籍。
        System.out.println("如果用户在前端搜索书籍，就可以这样比较并返回数据。");
        String searchName = "围城";//从前端将搜索值传递到后端服务器。后端服务器的搭建我们会在后面章节学习。这里假定已经拿到搜索值。
        System.out.println("使用该值和书名进行比较。");
        Book bookWeiCheng = new Book("围城");
        Book bookHongLouMeng = new Book("红楼梦");
        System.out.println("判断搜索值是否和书名相同，如果相同就将该书通过后端服务器返回到前端："+bookWeiCheng.name.equals(searchName));
        System.out.println("判断搜索值是否和书名相同，如果相同就将该书通过后端服务器返回到前端："+bookHongLouMeng.name.equals(searchName));

    }
}
