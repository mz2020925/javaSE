package demo24_Function_Interface.j5_function_interface_Predicate;

import java.util.function.Predicate;

public class and_or_Demo {
    public static void main(String[] args) {
        /*
        * default Predicate and(Predicate other) -- 返回一个组合判断，对应短路与
        * default Predicate or(Predicate other) -- 返回一个组合判断，对应短路或
        * */

        boolean b1 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b1);

        boolean b2 = checkString2("helloworld", s -> s.length() > 20, s -> s.length() < 15);
        System.out.println(b2);
    }

    private static boolean checkString(String str, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.and(pre2).test(str);
    }

    private static boolean checkString2(String str, Predicate<String> pre1, Predicate<String> pre2){
        return pre1.or(pre2).test(str);
    }
}
