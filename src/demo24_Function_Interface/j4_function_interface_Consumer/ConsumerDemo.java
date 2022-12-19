package demo24_Function_Interface.j4_function_interface_Consumer;

import java.util.function.Consumer;

/*
* Consumer接口也被称为消费型接口，它消费的数据的数据类型由泛型指定
* */
public class ConsumerDemo {
    public static void main(String[] args) {
        String str1 = "张明志";
        // 1.Lambda表达式实现打印
        operatorString(str1, (s) -> System.out.println(s));
        operatorString(str1, System.out::println);
        // 2.Lambda表达式实现反转打印
        operatorString(str1, s -> {
            System.out.println(new StringBuilder(s).reverse().toString());
        });

        // 3.定义一个方法，用不同的方式消费同一个字符串数据两次——打印和反转打印
        operatorString2(str1, s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse().toString()));
    }

    private static void operatorString(String str, Consumer<String> con) {
        con.accept(str);
    }

    private static void operatorString2(String str, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(str);
        /* 这里这句代码所牵扯到的知识很多
        * con1是函数式接口引用，它指向 Lambda表达式生成的实现类对应的实例化对象。
        * con1调用andThen方法，con2作为参数：
        default Consumer<T> andThen(Consumer<? super T> after) {
            Objects.requireNonNull(after);
            return (T t) -> { accept(t); after.accept(t); };
        }
        * 这是接口中的默认方法(不强制被重写)，注意这个方法的参数是一个通配符泛型(大于等于泛型T)
        * 方法体内第一行判断是否非null;
        * 第二行相当于Consumer<T> returnValue = (T t) -> { accept(t); after.accept(t); };注意这里的after指向con2。
        * 此时returnValue是函数式接口引用，它指向 Lambda表达式生成的实现类对应的实例化对象。
        * 所以con1.andThen(con2)现在相当于returnValue，
        * 然后con1.andThen(con2).accept(str)现在相当于returnValue.accept(str)，
        * returnValue的accept方法在上面被Lambda表达式重写了:
        * returnValue.accept(str) ==> { accept(str); after.accept(str); }，前一个accept是con1中的，后一个accept是con2的。
        * */
    }

}
