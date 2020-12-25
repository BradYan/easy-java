package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType04_long {

    public static void main(String[] args) {
        System.out.println("基本类型:long,二进制位数:" + Long.SIZE);
        System.out.println("最大值:" + Long.MAX_VALUE);
        System.out.println("最小值:" + Long.MIN_VALUE);
        //定义一个长整型
        long a = 60L; //有一个尾巴L,表示是长整型.l也是可以的.但为了防止看错成数字'1',一般用L.
        //定义地球的人口数量,值已经大于int最大值.
        long earthNumber = 7200000000L;
        //定义一个大型公司的负债
        long loan = -10000000000L;
        System.out.println(loan);
    }
}
