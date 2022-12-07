package demo1_baseRules;

public class j16_final_static {
    // 被final修饰的成员方法不能被重写
    // 被final修饰的成员变量不能被二次赋值，相当于常变量
    // 被final修饰的类不能被继承
    // 被final修饰的局部变量，若是基本数据类型，它的值不能变，若是应用数据类型，他所存储的地址不能变，地址指向的数据可以变。和上面修饰成员变量一样

    // 被static修饰的成员变量，可以被不同对象共享，什么叫共享，就是第一个对象第一次给这个变量赋值之后，后面的对象调用这个变量就是第一次赋的值，
    // 当然，是可以被改变的，改变之后后面的对象在调用这个对象时就是改变之后的值了。被static修饰的成员变量不仅可以通过 “对象名.变量名” 访问，也可以
    // 通过 “类名.变量名” 访问(推荐)。
    // 黑马没有说static修饰成员方法有什么用。

    // 在一个类中: 静态--被static修饰的
    // “非静态成员方法” 可以调用 “静态/非静态 成员变量/成员方法”。
    // “静态方法成员方法” 不能调用 “非静态成员变量/成员方法”，只能调用 “静态成员变量/成员方法”。
    // 因为main方法被static修饰，所以main方法只能调用他所在的哪个类中的静态方法


}