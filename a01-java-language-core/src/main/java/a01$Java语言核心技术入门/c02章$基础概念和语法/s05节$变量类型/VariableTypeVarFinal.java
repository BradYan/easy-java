package a01$Java语言核心技术入门.c02章$基础概念和语法.s05节$变量类型;

public class VariableTypeVarFinal {

    public static final double CIRCLE_PI = 3.1415926;
    public final double circlePI = 3.1415926;

    public static void main(String[] args) {
        System.out.println("静态常量,被final修饰，运行时不可以修改值："+VariableTypeVarFinal.CIRCLE_PI);
        VariableTypeVarFinal vF = new VariableTypeVarFinal();
        System.out.println("常量,被final修饰，运行时不可以修改值："+vF.circlePI);
    }
}
