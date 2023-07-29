package demo31_Enum.use_enumClass;

/*
* 枚举类的注意事项：
* 1.定义枚举类要使用关键字enum
* 2.所有的枚举类都是Enum的子类
* 3.枚举类的第一行上面必须是枚举项，最后一个枚举项后的分号是可以省略的，但是如果枚举类有其他东西，这个分号就不能省略。建议不要省略。
* 4.枚举类可以有构造器，但必须是private的，它默认是private的。若是带参构造器，枚举项的形式是：枚举项名字("参数");
* 5.枚举类也可以有抽象方法，但是枚举项以匿名内部类的方式必须重写该方法。
* 6.枚举在switch语句中的使用。
* */
public class LightDemo {
    public static void main(String[] args) {
        // 1.
        Light red = Light.RED;
        System.out.println(red);
        System.out.println("------------------");

        // 2.
        Light2 red2 = Light2.RED;
        System.out.println(red2);  // 这是toString()方法在起作用
        System.out.println(red2.getName());  // 这是获取字段name的值
        System.out.println("------------------");

        // 3.
        Light3 red3 = Light3.RED;  // 这里不需要写成Light3.RED("红)，因为枚举类中已经相当于创建好了Light3 RED= new Light3("红");
        System.out.println(red3);
        System.out.println(red3.getName());
        System.out.println("------------------");

        // 4.枚举类在switch语句中的使用
        Light light = Light.YELLOW;
        switch (light){
            // case RED -> System.out.println("红");  // jdk8不支持这样的语法
            // case GREEN -> System.out.println("绿");
            // case YELLOW -> System.out.println("黄");
        }

    }
}
