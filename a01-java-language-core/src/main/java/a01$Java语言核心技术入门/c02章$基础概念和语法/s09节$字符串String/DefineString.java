package a01$Java语言核心技术入门.c02章$基础概念和语法.s09节$字符串String;

public class DefineString {

    public static void main(String[] args) {
        String str = "Hello, Easy Java";
        System.out.println(str);
        String strConcat = "昆曼的《经济学原理》" + "是一本好书。" + "讲了很多经济学原理。";
        System.out.println(strConcat);

        String name;
//        System.out.println(name); //此处作为局部变量，直接使用会报错。需要先初始化。
        name = "<<经济学原理>>";
        System.out.println(name);

        //--------String类构造方法创建实例--------------------
        //使用默认构造方法创建空字符串。
        String defaultConstructorString = new String();
        System.out.println("打印空字符串:"+defaultConstructorString+"。");
        //使用一个参数的方式创建字符串。
        String str1 = new String("");
        System.out.println("打印空字符串："+str1);
        String str2 = new String("Hello Java");
        System.out.println("打印str2:"+str2);
        //这样的方式创建字符串，有些多余。直接用双引号定义。它们的值是相同的。
        String str3 = "Hello Java";
        System.out.println("打印str3:"+str3);

        //---------使用字符char数组创建String对象------------
        char[] charArray = {'H','e','l','l','o',' ','J','a','v','a'};
        String str4 = new String(charArray);
        System.out.println("打印str4:"+str4);

        //--------中文字符和英文字符的区别-------
        System.out.println("中文字符(串)---"+"双引号---“”---");
        System.out.println("英文字符(串)---"+"双引号---\"\"---");//这里打印英文双引号，需要转义。
        System.out.println("中文字符(串)---"+"单引号---’‘---");
        System.out.println("英文字符(串)---"+"单引号---''---");
        System.out.println("中文字符(串)---"+"冒号---：---");
        System.out.println("英文字符(串)---"+"冒号---:---");
        System.out.println("中文字符(串)---"+"句号---。---");
        System.out.println("英文字符(串)---"+"句号---.---");
        System.out.println("中文字符(串)---"+"逗号---，---");
        System.out.println("英文字符(串)---"+"逗号---,---");
        System.out.println("中文字符(串)---"+"分号---；---");
        System.out.println("英文字符(串)---"+"分号---;---");
        System.out.println("中文字符(串)---"+"括号---（）---");
        System.out.println("英文字符(串)---"+"括号---()---");
        System.out.println("还有区别的比如下划线破折号等。编码规范中，代码只有英文字标点符号才可以被正确识别。");

    }
}
