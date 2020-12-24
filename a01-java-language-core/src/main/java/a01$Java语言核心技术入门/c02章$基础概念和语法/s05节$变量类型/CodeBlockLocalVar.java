package a01$Java语言核心技术入门.c02章$基础概念和语法.s05节$变量类型;

public class CodeBlockLocalVar {

    int a = 2222;
    {//定义在类实例中的代码块，当类创建实例对象时，初始化过程中会加载该代码块。
        System.out.println(a);
        int a = 111111;
        System.out.println(a);//当有局部变量时，优先使用局部变量
    }

    public static void test(int b){
        try {
            int result = 10/(5 - b);
            System.out.println("打印result:"+ result);
        }catch (Exception e){
            System.out.println("打印局部变量e:"+e);
        }
    }

    public static void main(String[] args) {
        CodeBlockLocalVar codeBlockLocalVar = new CodeBlockLocalVar();

        CodeBlockLocalVar.test(5);

    }
}
