package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType06_double {

    public static void main(String[] args) {

        //double
        System.out.println("基本类型:double,二进制位数:" + Double.SIZE);
        System.out.println("最大值:" + Double.MAX_VALUE);
        System.out.println("最小值:" + Double.MIN_VALUE);
        //定义一个双精度浮点数
        double dValue = 0.01d; //D(d),默认可以省略.
        System.out.println("浮点数的不精确:" + dValue/0.1);//注意查看打印值。比如我的机器为：0.09999999999999999
    }
}
