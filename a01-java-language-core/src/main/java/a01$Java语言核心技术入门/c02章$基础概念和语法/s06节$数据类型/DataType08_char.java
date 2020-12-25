package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DataType08_char {

    public static void main(String[] args) {
        //这里的Character是一个包装类
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE=" + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE=" + (int) Character.MAX_VALUE);

        char character = 'A';
        System.out.println(character);
        System.out.println((int)character);//强制转换为整型，可以比较整数大小。
        char special_one = '$';
        System.out.println(special_one);
        char han_zi = '\u4f60';
        System.out.println(han_zi);
        System.out.println('\u52a0');
        System.out.println('\u6cb9');
    }
}
