package demo3_multiState;

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
        // 因为成员方法可以有重写，所以对它来说，执行看右边，而且看右边执行子类的成员方法必须是重写的成员方法--不能是子类独有的方法，这就是使用多态的缺点
        // 要解决这个缺点就要用到向下转型
        //

        animalOperator ao = new animalOperator();

        cat c = new cat();
        ao.useAnimal(c);

        dog d = new dog();
        ao.useAnimal(d);

        pig p = new pig();
        ao.useAnimal(p);
    }
}
