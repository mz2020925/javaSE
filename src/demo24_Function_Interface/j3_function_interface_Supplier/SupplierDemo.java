package demo24_Function_Interface.j3_function_interface_Supplier;

import java.util.function.Supplier;


/*
* Supplier接口也被称为生产型接口，如果我们指定了接口的泛型是什么类型，那么接口中的get方法就会生产什么类型的数据供我们使用。
* */
public class SupplierDemo {
    public static void main(String[] args) {
        String s = getString(() -> "张明志");
        System.out.println(s);

        Integer num = getInteger(() -> 1234);
        System.out.println(num);
    }

    private static Integer getInteger(Supplier<Integer> i){
        return i.get();
    }

    private static String getString (Supplier<String> sup){
        // 这个方法的形式参数式函数式接口类型，这个接口只有唯一的抽象方法get()
        // 后面我们调用这个方法的时候，会传进来使用一个Lambda表达式来传递参数
        // get()方法没有形式参数，返回值是一个泛型，重写这个方法类似于有一个”return 值“即可
        return sup.get();
    }
}
