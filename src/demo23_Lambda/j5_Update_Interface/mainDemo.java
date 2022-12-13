package demo23_Lambda.j5_Update_Interface;

/*
默认方法
    定义：不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候不加default关键字，public可以省略，default不能省略
    情形：想要在后期给接口添加方法，然后实现这个接口的子类可以选择性的重写此方法，此时这个方法就叫默认方法

静态方法：
    定义：静态方法只能通过接口名调用，不能通过实现类名或者对象名调用，public可以省略，static不能省略
    情形：想要通过接口名直接调用方法，这个方法被不能实现类重写

私有方法：
    定义：ava 9中新增了带方法体的私有方法，这其实在Java 8中就埋下了伏笔：Java 8允许在接口中定义带方法体的
        默认方法和静态方法。这样可能就会引发一个问题：当两个默认方法或者静态方法中包含一段相同的代码实
        现时，程序必然考虑将这段实现代码抽取成一个共性方法，而这个共性方法是不需要让别人使用的，因此用
        私有给隐藏起来，这就是Java 9增加私有方法的必然性。
    情形：默认方法可以调用私有的静态方法和非静态方法
        静态方法只能调用私有的静态方法

* */
public class mainDemo {
    public static void main(String[] args) {
        MyInterface myInter = new MyClassImpl1();
        myInter.show1();
        myInter.show2();
        // 接口中的默认方法调用
        myInter.show3();
        // 接口中的静态方法调用
        MyInterface.show4();
        // 接口中的私有方法调用--私有方法是为了接口中的其他方法调用这个私有方法来实现一些功能。



        // 该实现类中只重写了普通抽象方法
        MyInterface myInter2 = new MyClassImpl2();
    }
}
