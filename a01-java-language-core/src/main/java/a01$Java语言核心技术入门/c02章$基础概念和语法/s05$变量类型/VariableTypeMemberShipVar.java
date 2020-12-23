package a01$Java语言核心技术入门.c02章$基础概念和语法.s05$变量类型;

public class VariableTypeMemberShipVar {

    String memberShipVar;//实例变量
    static String classVar; //类变量

    public void functionName(){
        //this is a function.
    }

    public static void main(String[] args) {

        VariableTypeMemberShipVar varA = new VariableTypeMemberShipVar();
        varA.memberShipVar = "红楼梦"; //设置成员变量中实例变量的值.
        VariableTypeMemberShipVar varB = new VariableTypeMemberShipVar();
        varB.memberShipVar = "三国演义"; //设置成员变量中实例变量的值.
        System.out.println("varA的成员变量的实例变量值:"+varA.memberShipVar);
        System.out.println("varB的成员变量的实例变量值:"+varB.memberShipVar);

        varA.classVar = "曹雪芹";//设置类变量值
        System.out.println("varA的类变量值:"+varA.classVar);
        varB.classVar = "罗贯中";//设置类变量值
        System.out.println("varA的类变量值:"+varA.classVar);
        System.out.println("varB的类变量值:"+varB.classVar);
        VariableTypeMemberShipVar.classVar = "类名直接设置值";//类变量的值属于类的.实例对象公用这个值.不需要实例化对象也可以直接访问和赋值.
        System.out.println("VariableTypeMemberShipVar的类变量值:"+VariableTypeMemberShipVar.classVar);

    }

}
