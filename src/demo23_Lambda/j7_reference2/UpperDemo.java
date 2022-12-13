package demo23_Lambda.j7_reference2;

public class UpperDemo {
    public static void main(String[] args) {
        // Lambda表达式
        useUpperInter(s -> {
            String res = s.toUpperCase();
            System.out.println(res);
        }, "HelloWorld");
        // Lambda表达式简化
        useUpperInter(s -> s.toUpperCase(), "HelloWorld");
        // Lambda表达式被 引用类成员方法 替代
        useUpperInter(String::toUpperCase, "HelloWorld");

        // 2.引用对象的实例方法，对象::实例方法
        Upper up = new Upper();
        useUpperInter(up::upper, "HelloWorld");

    }

    private static void useUpperInter(UpperInter upperInter, String s) {
        upperInter.printUpperCase(s);
    }
}
