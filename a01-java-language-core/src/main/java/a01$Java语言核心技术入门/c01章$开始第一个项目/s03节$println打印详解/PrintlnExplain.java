package a01$Java语言核心技术入门.c01章$开始第一个项目.s03节$println打印详解;

public class PrintlnExplain {

    public static void main(String[] args) {
        System.out.println("打印字符串");
        System.out.println("打印字符串拼接:"+"abcde");
        System.out.println("打印字符串拼接:"+"abcde"+"fghijk等各种字符");
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和整数字:"+123456);
        System.out.println("打印字符串和小数:"+3.1415926);
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和多个数字:"+3+7+3+7);
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和数字--乘号:"+3*7+3*7); //用乘号* 改变了优先级。

        System.out.println("打印字符串和数字--括号:"+(3+7)+(3+7)); //用括号() 改变了优先级。
        System.out.println("-----------------------------------------------------------");
        System.out.println("打印字符串和数字--乘号括号:"+(3*7+3*7)); //用乘号*和括号 改变了优先级。

        System.out.println("打印字符串和数字--多个括号:"+((3+7)+(3+7))); //用多个括号() 改变了优先级。
        System.out.println("-----------------------------------------------------------");
        System.out.print("打印字符串这里不换行1。");
        System.out.println("打印字符串这里换行2。");
        System.out.print("打印字符串这里不换行3。");
        System.out.println("打印字符串这里换行4。");
    }
}
