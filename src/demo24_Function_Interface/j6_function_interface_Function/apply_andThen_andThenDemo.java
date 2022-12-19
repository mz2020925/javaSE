package demo24_Function_Interface.j6_function_interface_Function;

import java.util.function.Function;

public class apply_andThen_andThenDemo {
    public static void main(String[] args) {
        String str = "林青霞,30";

        int num = convert(str, s -> s.split(",")[1], Integer::parseInt, s -> s + 30);
        System.out.println(num);

    }

    private static int convert(String s, Function<String, String> fun1,
                               Function<String, Integer> fun2,
                               Function<Integer, Integer> fun3) {
        Integer i = fun1.andThen(fun2).andThen(fun3).apply(s);
        return i;
    }
}
