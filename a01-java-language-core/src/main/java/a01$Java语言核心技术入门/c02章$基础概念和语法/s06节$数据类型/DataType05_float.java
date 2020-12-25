package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType05_float {

    public static void main(String[] args) {
        //float
        System.out.println("基本类型:float,二进制位数:" + Float.SIZE);
        System.out.println("最大值:" + Float.MAX_VALUE);
        System.out.println("最小值:" + Float.MIN_VALUE);
        //定义一个单精度浮点数
        float aValue = 0.1f; //有一个尾巴F(f),表示是float.
        System.out.println("浮点数的不精确:" + aValue/1.0);//注意查看打印值。比如我的机器为：0.10000000149011612
    }
}
