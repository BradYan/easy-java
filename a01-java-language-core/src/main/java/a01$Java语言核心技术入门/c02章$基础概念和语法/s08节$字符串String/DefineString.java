package a01$Java语言核心技术入门.c02章$基础概念和语法.s08节$字符串String;

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


    }
}
