package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType01_byte {

    public static void main(String[] args) {
        //这里的Byte是一个包装类,后面会讲到.值上等价于基本类型.同理后面的包装类Short,Integer,Long,Float,Double,Boolean.
        System.out.println("基本类型:byte,二进制位数:" + Byte.SIZE);
        System.out.println("最大值:" + Byte.MAX_VALUE);//最大值127
        System.out.println("最小值:" + Byte.MIN_VALUE);//最小值-128
        //定义一个byte
        byte a = -20;
        System.out.println(a);
        //定义一个班级人数
        byte b = 50;
        System.out.println(b);
    }
}
