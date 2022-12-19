package demo24_Function_Interface.j5_function_interface_Predicate;

import java.util.function.Predicate;

public class test_negate_Demo {
    public static void main(String[] args) {
        /*
        * boolean test(T t) -- 对给定的参数进行判断(判断逻辑由Lambda表达式实现)，返回一个布尔值
        * default Predicate negate() -- 返回一个逻辑的否定，对应逻辑非
        * */

        boolean b1 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString2("helloworld", s -> s.length() > 8);
        System.out.println(b2);



    }

    private static boolean checkString(String str, Predicate<String> pre){
        return pre.test(str);
        // return !pre.test(str);  // 这是一种实现非的方式，但通常不用这个，用下面的
        // return pre.negate().test(str);
    }

    private static boolean checkString2(String str, Predicate<String> pre){
        // return pre.test(str);
        // return !pre.test(str);  // 这是一种实现非的方式，但通常不用这个，用下面的
        return pre.negate().test(str);
    }
}
