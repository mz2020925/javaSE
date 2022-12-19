package demo24_Function_Interface.j6_function_interface_Function;

import java.util.function.Function;

public class apply_andThenDemo {
    public static void main(String[] args) {
        // 1.Lambda表达式
        // convert("100", s->Integer.parseInt(s));
        // 2.方法引用符
        int num = convert("100", Integer::parseInt);
        System.out.println(num);

        num = convert(100, i -> i + 10);
        System.out.println(num);

        //
        String str1 = convert("1001", Integer::parseInt, s -> String.valueOf(s + 110));
        System.out.println(str1);

    }


    //定义一个方法，把一个字符串转换int类型
    private static int convert(String s, Function<String, Integer> fun) {
        int i = fun.apply(s);
        return i;
    }

    //定义一个方法，把一个int类型的数据加上一个整数
    private static int convert(int temp, Function<Integer, Integer> fun) {
        int i = fun.apply(temp);
        return i;
    }

    //定义一个方法，把一个字符串转换int类型，把int类型的数据加上一个整数之后，转为字符串
    private static String convert(String str, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String s = fun1.andThen(fun2).apply(str);
        return s;
    }
}
