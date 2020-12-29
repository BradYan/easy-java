package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class EscapeCharacter {

    public static void main(String[] args) {
        System.out.println("转义字符测试:\n,具有换行效果."); //在Unix内核的系du统中换行就是\n，但是windows系统中换行需要\r\n都用.作用主要就是在文本的显示效果上另起一行.
        System.out.println("转义字符测试:\t,具有Tab按键效果.");
        //特殊字符的打印,字符串的用法是双引号成对. 如果字符串中含有双引号,那么需要用反斜杠转义才可以识别.
        System.out.println("转义字符测试:\",打印双引号.");
        //同样的,反斜杠也是特殊字符
        System.out.println("转义字符测试:\\,打印反斜杠.");
        //在char字符中,单引号是成对出现的,如果需要使用单引号,也需要用反斜杠转义.
        char charData = '\'';
        System.out.println("转义字符测试,打印单引号:"+charData);

        //有时候抓取别人网站数据的时候,看到\\u的特殊字符串,基本都是unicode转义字符.我们可以在网上用转码工具查询.
        char a = '\u4f60';
        String b = "\u52a0";
        String c = "\u6cb9";
        System.out.println(a+b+c);
    }
}
