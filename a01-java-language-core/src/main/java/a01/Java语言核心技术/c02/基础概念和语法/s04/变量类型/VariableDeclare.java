package a01.Java语言核心技术.c02.基础概念和语法.s04.变量类型;

public class VariableDeclare {

    String name;    //新建对象的时候，默认为null
    int totalGrade; //新建对象的时候，默认为0
    double sellPrice; //新建对象的时候，默认为0.0

    public static void main(String[] args) {
        //变量申明
        System.out.println("------变量申明-------------------------------------------");

        String bookname;    // String 类型的变量
        boolean isPopular;    // boolean 类型的变量
        int totalWords;    // int 类型的变量

        int a, b, c;         // 声明三个int型整数：a、 b、c
        System.out.println("-------------------------------------------------");
        System.out.println("------直接申明-------------------------------------------");
        //直接申明
        String author = "曹雪芹";     // 直接赋值
        double pi = 3.1415926; // 声明了双精度浮点型变量 pi
        int d = 3, e = 4, f = 5; // 声明三个整数并赋予初值


        System.out.println("-------------------------------------------------");
        System.out.println("------先申明，后赋值。-------------------------------------------");
        //先申明，后赋值。
        String bookName;    // 先声明
        bookName ="红楼梦";    // 后赋值

        String readerName,grade, comment;//读者，评分，评价    // 声明多个变量
        readerName = "布拉德";
        grade = "经典巨著";
        comment = "伟大的作品，禁得起时间的考验";


        System.out.println("-------------------------------------------------");
        System.out.println("------初始化值。-------------------------------------------");
        VariableDeclare variableType = new VariableDeclare();
        System.out.println("String初始化值为:"+variableType.name);
        System.out.println("int初始化值为:"+variableType.totalGrade);
        System.out.println("double初始化值为:"+variableType.sellPrice);
        int yNotInitial;
        System.out.println("-----在方法中，未初始化，会出错。开发工具会提示该错误。-----------");
//        System.out.println(yNotInitial); //取消该注释，会看到红色的提示。
    }
}
