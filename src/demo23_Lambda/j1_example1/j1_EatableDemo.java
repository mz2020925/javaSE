package demo23_Lambda.j1_example1;

/*
Lambda表达式的使用前提
    有一个接口
    接口中有且仅有一个抽象方法
练习描述
    无参无返回值抽象方法的练习
操作步骤
    定义一个接口(Eatable)，里面定义一个抽象方法：void eat();
    定义一个测试类(EatableDemo)，在测试类中提供两个方法
    一个方法是：useEatable(Eatable e)
    一个方法是主方法，在主方法中调用useEatable方法
* */
public class j1_EatableDemo {
    public static void main(String[] args) {
        // 1.面向对象的思想，同时还额外定义一个方法来调用实例化对象的eat()方法
        Eatable eatable = new EatableImpl();
        String str = useEatable(eatable);
        System.out.println(str);

        // 2.匿名内部类


        // 3.使用Lambda，Lambda表达式代替的是useEatable(eatable)中的对象参数，
        // 即不需要这句代码Eatable eatable = new EatableImpl();来创建对象了。
        // lambda表达式可以看作匿名函数
        String str2 = useEatable(() -> {
            System.out.println("lambda表达式");
            return "我要干饭";  // 这里给Lambda表达式增加了返回值，但不需要指定返回值类型
        });
        System.out.println(str2);


    }

    // 为什么不在主方法中直接调用eat函数，反而把对象传过来呢。
    // 这可能是一种思想。尽量简化主方法。
    public static String useEatable(Eatable e) {
        return e.eat();
    }


}
