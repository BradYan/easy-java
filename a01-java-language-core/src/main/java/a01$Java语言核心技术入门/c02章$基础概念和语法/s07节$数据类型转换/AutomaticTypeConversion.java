package a01$Java语言核心技术入门.c02章$基础概念和语法.s07节$数据类型转换;

public class AutomaticTypeConversion {

    public static void main(String[] args) {
        //数值型数据的转换：byte→short→int→long→float→double
        byte bookPriceHongLouMengByte = 100; //定义书的价格:<<红楼梦>>
        short bookPriceHongLouMengShort = 101; //定义书的价格:<<红楼梦>>
        int bookPriceHongLouMengInt = 102; //定义书的价格:<<红楼梦>>
        float bookPriceHongLouMengFloat = 103.9f; //定义书的价格:<<红楼梦>>
        double bookPriceHongLouMengDouble = 104.9f; //定义书的价格:<<红楼梦>>

        bookPriceHongLouMengDouble = bookPriceHongLouMengByte;
        System.out.println("byte自动类型转换赋值给高级double: "+bookPriceHongLouMengDouble);
        bookPriceHongLouMengDouble = bookPriceHongLouMengShort;
        System.out.println("short自动类型转换赋值给高级double: "+bookPriceHongLouMengDouble);
        bookPriceHongLouMengDouble = bookPriceHongLouMengInt;
        System.out.println("int自动类型转换赋值给高级double: "+bookPriceHongLouMengDouble);
        bookPriceHongLouMengDouble = bookPriceHongLouMengFloat;
        System.out.println("float自动类型转换赋值给高级double: "+bookPriceHongLouMengDouble);

        int buyNum = 2; // 定义购买的数量
        //在表达式计算中,buyNum同样进行了自动类型转换,先转成double类型,再计算值.
        double totalPrice = bookPriceHongLouMengDouble * buyNum ; // 计算总价
        System.out.println("一共付给书店" + totalPrice + "元"); // 输出总价
        // double作为浮点数,用作价格计算需要注意精度问题.

    }
}
