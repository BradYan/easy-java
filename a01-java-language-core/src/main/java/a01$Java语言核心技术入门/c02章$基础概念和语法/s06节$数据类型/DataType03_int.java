package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType03_int {

    public static void main(String[] args) {
        //这里的Integer是一个包装类,后面会讲到.值上等价于基本类型.同理后面的Long,Double,Boolean.
        System.out.println("基本类型:int,二进制位数:" + Integer.SIZE);
        System.out.println("最大值:" + Integer.MAX_VALUE); //2147483647
        System.out.println("最小值:" + Integer.MIN_VALUE); //-2147483648
        //定义一个整型
        int a = 10;
        //定义一个城市的人数
        int cityPeople = 5000000;
        //定义一个人很穷,资产是负整数
        int fortune = -100;
        System.out.println(fortune);
    }
}
