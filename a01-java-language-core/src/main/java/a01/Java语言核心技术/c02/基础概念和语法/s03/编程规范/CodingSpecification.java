package a01.Java语言核心技术.c02.基础概念和语法.s03.编程规范;

import a01.Java语言核心技术.c02.基础概念和语法.s02.第一个类和对象.Book;

public class CodingSpecification{
        String variable;//注意观察，变量的格式与空格。

    public void add(int a,int b){
        System.out.println("注意观察，参数的格式与空格。");
    }

    public static void main(String[] args){
        System.out.println("使用开发工具的格式化代码功能，菜单Code-->Reformat Code功能。快捷键Ctrl+Alt+L");
        System.out.println("注意观察，变量的格式与空格。");
            Book book1=new Book();
        System.out.println("保持一个屏幕的合适的宽度--------------------" +
                "保持一个屏幕的合适的宽度--------------------" +
                "保持一个屏幕的合适的宽度--------------------");
    }
}
