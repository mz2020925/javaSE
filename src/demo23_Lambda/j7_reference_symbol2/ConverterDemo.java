package demo23_Lambda.j7_reference_symbol2;

public class ConverterDemo {
    public static void main(String[] args) {
        // 1.引用类方法，其实就是引用类的静态方法，类名::静态方法
        useConverter(s -> Integer.parseInt(s), "1234");
        // Lambda表达式被 引用类静态方法 替代的时候，它的形式参数全部传递给这个 类静态方法 作为参数
        useConverter(Integer::parseInt, "2134");

    }

    private static void useConverter(Converter c, String s) {
        int num = c.convert(s);
        System.out.println(num);
    }
}
