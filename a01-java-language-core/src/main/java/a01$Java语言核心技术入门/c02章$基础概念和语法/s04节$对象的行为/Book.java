package a01$Java语言核心技术入门.c02章$基础概念和语法.s04节$对象的行为;

public class Book {

    String name; //书名，类型为字符串String，默认值为null
    String author; //作者，类型为字符串String，默认值为null
    int rank; //排名，类型为整型int，默认值为0
    String brief;//书名简介 , 类型为字符串String
    int totalRead;//本书总阅读人数， 类型为整型 int, 默认值为0
    int totalComment; //本书总评价数， 类型为整型 int
    double score; //本书平均评分 ，类型为小数， double类型。

    public int addRead(){//当有新用户阅读时，就给阅读数加一。并返回最新的数量
        totalRead = totalRead + 1;
        return totalRead;
    }

    public int addComment(){//当有新评论时，评论数加一。并返回最新的数量
        totalComment = totalComment + 1;
        return totalComment;
    }

    public static void main(String[] args) {
        Book hongLouMeng = new Book();
        System.out.println("----------------从数据库读取出这些数据,并初始化赋值.------------");
        hongLouMeng.name = "红楼梦";
        hongLouMeng.author = "曹雪芹";
        hongLouMeng.rank = 5;
        hongLouMeng.brief = "《红楼梦》又名《石头记》，是中国古典小说的巅峰之作，位居“中国古典四大名著”之首。...";
        hongLouMeng.totalRead = 652000;
        hongLouMeng.totalComment = 31000;
        hongLouMeng.score = 8.9;
        System.out.println("----------------返回到前端浏览器,这里我们暂时忽略其它元素,比如评论内容,图片等.------------");
        System.out.println("------前端浏览器,有新用户阅读本书,就会发送请求,让阅读数加一.因为这个行为动作总是加一,所以方法就不传入参数了.------------");
        int read = hongLouMeng.addRead();
        System.out.println("-----返回最新的阅读数给浏览器,同时将最新的数据保存到数据库中,readTotal:"+read);
        //同样的,当有用户评论时,调用addComment()方法
        System.out.println("-----返回最新的阅读数给浏览器,同时将最新的数据保存到数据库中,commentTotal:"+hongLouMeng.addComment());
        //这里我们暂时先不处理评分计算,以及用户评论内容保存,以后章节处理.
    }
}
