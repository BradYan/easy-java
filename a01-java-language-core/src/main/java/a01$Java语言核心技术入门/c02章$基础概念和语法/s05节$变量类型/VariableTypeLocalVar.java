package a01$Java语言核心技术入门.c02章$基础概念和语法.s05节$变量类型;

public class VariableTypeLocalVar {

    public static void main(String[] args) {
        int lVa = 10;
        System.out.println("方法局部变量, lVa =" + lVa);
        testFunctionA();//该方法的局部变量。

        System.out.println("方法参数局部变量: args ="+ args);
        testFunctionB(11);//该方法的参数变量。将整数值 11传递给方法参数input。

        {
            int lVb = 5;
            System.out.println("代码块局部变量, lVb = " + lVb);
            System.out.println("代码块中可以访问到 lVa =" + lVa);

        }

        {
            int lVc = 3;
            System.out.println("代码块局部变量, lVc = " + lVc);
            System.out.println("代码块中可以访问到 lVa =" + lVa);
            System.out.println("代码块中可以访问到 args =" + args);
//            System.out.println("代码块中不可以访问到 lVb ." + lVb); //取消注释,查看报错效果.
        }
//            System.out.println("这里也不可以访问到 lVb,lVc. lVb=" + lVb+",lVc="+lVc); //取消注释,查看报错效果.
    }

    public static void testFunctionA(){
        int a = 1;
        System.out.println("方法局部变量, a = " + a);
    }

    public static void testFunctionB(double input){
        System.out.println("方法参数局部变量, input = " + input);
    }
}
