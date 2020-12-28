package a01$Java语言核心技术入门.c02章$基础概念和语法.s06节$数据类型;

public class DefaultValue {

    byte byteData;
    short shortData;
    int intData;
    long longData;
    float floatData;
    double doubleData;
    boolean booleanData;
    String stringData;
    char charData;

    public static void main(String[] args) {
        DefaultValue defaultValue = new DefaultValue();
        System.out.println("byte默认值:"+defaultValue.byteData);
        System.out.println("int默认值:"+defaultValue.intData);
        System.out.println("short默认值:"+defaultValue.shortData);
        System.out.println("long默认值:"+defaultValue.longData);
        System.out.println("float默认值:"+defaultValue.floatData);
        System.out.println("double默认值:"+defaultValue.doubleData);
        System.out.println("boolean默认值:"+defaultValue.booleanData);
        System.out.println("String默认值:"+defaultValue.stringData);
        System.out.println("char默认值:"+defaultValue.charData);
        System.out.println("char默认值(数值):"+(int)defaultValue.charData);
    }
}
