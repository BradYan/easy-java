package a01.Java语言核心技术.c02.基础概念和语法.s01.Java注释;

/**
 *  这文档注释，
 *  可以注释多行内容。
 *  这里的*是可以去掉的。
 *  为了美观，IDEA自动加上了。
 *  //这里嵌套了单行注释。
 *  这里注释用在了类上。
 */
public class JavaComment {

    public static void main(String[] args) {

        System.out.println("单行注释方式。");//这是单行注释方式，放在代码行后面。
        //这也是是单行注释方式。
        System.out.println("这也是单行注释方式，放在代码行上面。");

        /*
         *  这是多行注释，
         *  可以注释多行内容。
         *  这里的*是可以去掉的。
         *  为了美观，IDEA自动加上了。
         * //这里嵌套了单行注释。
         */
        System.out.println("多行注释方式。");

    }
}
