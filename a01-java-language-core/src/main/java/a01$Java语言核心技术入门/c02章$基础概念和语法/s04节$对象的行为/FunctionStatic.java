package a01$Java语言核心技术入门.c02章$基础概念和语法.s04节$对象的行为;

public class FunctionStatic {

    public int add(int a, int b){ //多个参数用逗号隔开
        System.out.println("这是有返回值的方法，有参数，方法里可以写各种代码。返回两个数的和。");
        return a + b;
    }

    public static int addStatic(int a, int b){ //多个参数用逗号隔开
        System.out.println("这是有返回值的静态方法，有参数，外部可以直接调用该方法，无需实例化。");
        return a + b;
    }
    public static void doSomethingStatic(){
        System.out.println("这是无返回值的静态方法，也没有参数，方法里可以写各种代码。");
    }

    public static void main(String[] args) {
        FunctionStatic function = new FunctionStatic();
        int result = function.add(1, 3); //当方法返回一个值的时候，方法调用的返回值通常赋给一个新的变量。
        System.out.println("打印出两个值相加的结果："+result);
        System.out.println("也可以简写成这样的方式，看需要决定。"+function.add(1, 3));

        System.out.println("-----调用静态方法-----------------------------------------------------");
        System.out.println("直接调用静态方法，打印出两个值相加的结果："+ FunctionStatic.addStatic(2,4));
        FunctionStatic.doSomethingStatic();//直接调用静态方法,无需实例化。
    }
}
