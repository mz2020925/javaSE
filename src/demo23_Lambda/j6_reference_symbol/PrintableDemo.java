package demo23_Lambda.j6_reference_symbol;

/*
方法引用符
    :: 该符号为引用运算符，而它所在的表达式被称为方法引用
推导与省略
    如果使用Lambda，那么根据“可推导就是可省略”的原则，无需指定参数类型，也无需指定的重载形式，
    它们都将被自动推导
    如果使用方法引用，也是同样可以根据上下文进行推导
    方法引用是Lambda的孪生兄弟
* */
public class PrintableDemo {
    public static void main(String[] args) {
        // 1.Lambda表达式的使用
        usePrintable((String s)->{
            System.out.println(s);
        });

        // 2.Lambda表达式的简化
        usePrintable(s -> System.out.println(s));

        // 3.方法运用符::的使用 -- 引用了System.out对象的println方法来重写接口中的抽象方法，这就是如何使用已经存在的方案？
        usePrintable(System.out::println);

        // 4.
    }

    private static void usePrintable(Printable p) {
        p.printString("函数参数是一个字符串");
    }
}
