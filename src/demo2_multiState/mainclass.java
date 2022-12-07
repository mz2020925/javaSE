package demo2_multiState;

public class mainclass {
    public static void main(String[] args) {
        // 多态：同一个对象，在不同条件下表现出不同状态
        // 写多态代码要有前提条件:
        // 1.有继承关系/实现关系
        // 2.有方法重写
        // 3.有父类引用指向子类对象

        // 多态中的成员方法特点:
        // 成员变量: 编译看左边，执行(运行)看左边;
        // 成员方法: 编译看左边，执行(运行)看右边;
        // 因为成员方法可以有重写，所以对它来说，执行看右边，而且看右边执行子类的成员方法必须是重写的成员方法


        animal an = new cat();  // 写多态代码的前提条件3，这里这句代码就是“向上转型”
        an.setFood("父类鱼");  // 这里animal对象只能调用父类animal类中的成员变量/成员方法(当然不能有private修饰)，不能调用子类cat中的成员变量/成员方法(当然不能有private修饰)
        an.eat();
//        an.age();  // 这里时会报错的


        cat c = (cat)an;  // 向下转型，然后就可以使用cat类中的独有方法
        c.age();


    }
}
