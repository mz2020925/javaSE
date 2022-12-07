package demo23_Lambda.j2_return_argus;

/*
Lambda表达式的使用前提
    有一个接口
    接口中有且仅有一个抽象方法
* */
public class j2_lambda_return_argus {
    public static void main(String[] args) {
        // 1.使用Lambda表达式的情况下，其中的接口中只能由一个抽象方法
        // Lambda表达式在这里作用是什么？--写了实现接口的类、重写了抽象方法、然后多态创建了实例化接口的对象，最后该对象被赋给某个引用
        Add add = (int a, int b) -> {
            return a + b;  // 这里给Lambda表达式增加了返回值，和输入参数
        };
        int summer = add.calcuAdd(2, 3);
        System.out.println(summer);

        // 2.Lambda表的式的另一个用法
        // Lambda表达式在这里作用是什么？--写了实现接口的类、重写了抽象方法、然后多态创建了实例化接口的对象、最后该对象被传给方法useAdd()
        useAdd((int a, int b) -> {
            return a + b;
        }, 10, 20);

        // 3.比Lambda表达式更加简单的方式
        useAdd(Integer::sum, 10, 20);

        // 4.省略Lambda表达式的输入参数的类型
        // 4.1参数类型可以省略。但是有多个参数的情况下，不能只省略一个，要省都省
        useAdd((a, b) -> {
            System.out.println("Lambda表达式重写的抽象方法被调用了");
            return a + b;
        }, 10, 20);

        // 4.2如果参数有且仅有一个，那么小括号可以省略
        useSquare(a -> {
            System.out.println("Lambda表达式重写的抽象方法被调用了");
            return a * a;
        }, 10);

        // 4.3如果代码块的语句只有一条，可以省略大括号和分号，和return关键字
        useSquare(a -> a * a, 10);

    }

    private static void useAdd(Add add, int num1, int num2) {
        int sum = add.calcuAdd(num1, num2);
        System.out.println(sum);
    }

    private static void useSquare(Square sq, double num) {
        double ans = sq.square(num);
        System.out.println(ans);
    }
}
