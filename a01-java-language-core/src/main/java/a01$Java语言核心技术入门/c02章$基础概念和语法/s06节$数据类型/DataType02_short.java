package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType02_short {

    public static void main(String[] args) {
        //这里的Short是一个包装类
        System.out.println("基本类型:short,二进制位数:" + Short.SIZE);
        System.out.println("最大值:" + Short.MAX_VALUE);//32767
        System.out.println("最小值:" + Short.MIN_VALUE);//-32768
        //定义一个整型
        short a = 10;
        //定义学校的人数
        short student = 11100;
        System.out.println(student);
    }
}
