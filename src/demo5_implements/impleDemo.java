package demo5_implements;

public class impleDemo {
    // 抽象类和接口的区别
    // 成员变量和成员方法的区别：
    //      抽象类：有成员变量，成员常量；有构造方法，可以没有抽象方法（但无意义）；可以有非抽象方法（普通抽象方法）。
    //      接口：成员常量；抽象方法。
    // 关系区别：
    //      类继承类：继承，单继承
    //      类实现接口：实现，可以单实现，也可以多实现
    //      接口继承接口：继承，单继承，多继承
    // 设计理念：
    //      抽象类：对类抽象，包括属性，行为（成员方法）
    //      接口：对行为抽象，主要是行为（成员方法）

    public static void main(String[] args) {
        jumpping jump = new cat();  // 接口的实例化也采用多态，它本身是不能new jumpping的。
        jump.jump();  // 接口的作用可以作为继承的弥补。如果想对多个具体类的功能进行增加，直接修改父类是不好的，一个一个添加也不好，这时就要用到接口

        animal an = new cat();  // 抽象类的实例化采用多态方式
        an.eat();
        an.age();

        cat c = new cat();  // 具体类（继承了抽象类，实现了接口）的实例化
        c.eat();
        c.age();
        c.jump();
    }
}
