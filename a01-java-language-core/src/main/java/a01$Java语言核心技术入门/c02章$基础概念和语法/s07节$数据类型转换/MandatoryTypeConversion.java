package a01$Java语言核心技术入门.c02章$基础概念和语法.s07节$数据类型转换;

public class MandatoryTypeConversion {

    public static void main(String[] args) {
        //数值型数据的转换：byte→short→int→long→float→double
        byte bookPriceHongLouMengByte = 100; //定义书的价格:<<红楼梦>>
        short bookPriceHongLouMengShort = 101; //定义书的价格:<<红楼梦>>
        int bookPriceHongLouMengInt = 102; //定义书的价格:<<红楼梦>>
        long bookPriceHongLouMengLong = 103; //定义书的价格:<<红楼梦>>
        float bookPriceHongLouMengFloat = 103.9f; //定义书的价格:<<红楼梦>>
        double bookPriceHongLouMengDouble = 104.9f; //定义书的价格:<<红楼梦>>

        bookPriceHongLouMengFloat = (float) bookPriceHongLouMengDouble;
        System.out.println("double强制类型转换赋值给低级float: "+bookPriceHongLouMengFloat);
        bookPriceHongLouMengLong = (long) bookPriceHongLouMengDouble;
        System.out.println("double强制类型转换赋值给低级long: "+bookPriceHongLouMengLong);
        bookPriceHongLouMengInt = (int) bookPriceHongLouMengDouble;
        System.out.println("double强制类型转换赋值给低级int: "+bookPriceHongLouMengInt);
        bookPriceHongLouMengShort = (short)bookPriceHongLouMengFloat;
        System.out.println("float强制类型转换赋值给低级short: "+bookPriceHongLouMengShort);
        bookPriceHongLouMengByte = (byte)bookPriceHongLouMengLong;
        System.out.println("long强制类型转换赋值给低级byte: "+bookPriceHongLouMengByte);
        //在强制类型转换中，如果是将浮点类型的值转换为整数，直接去掉小数点后边的所有数字,而不是四舍五入；

        int buyNum = 2; // 定义购买的数量
        int totalPrice = (int) (bookPriceHongLouMengDouble * buyNum) ; // 计算总价得到浮点数值,将结果强制转换为整数.
        System.out.println("一共付给书店" + totalPrice + "元");
        //强制类型转换中，如果返回高级类型的值范围大于原值，会出现数据失真。需要注意业务中的数据范围这点。
        bookPriceHongLouMengInt = 280;
        bookPriceHongLouMengByte = (byte)bookPriceHongLouMengInt;
        System.out.println("此处可以看到，数据值出现了异常："+bookPriceHongLouMengByte);
    }
}
