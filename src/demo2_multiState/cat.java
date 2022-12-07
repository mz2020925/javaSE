package demo2_multiState;

public class cat extends animal{
    private String food="子类鱼";
    private int age=10;

    // 这个方法就是子类重写方法，可以animal an = new cat();之后an.eat()使用多态中的 “成员方法执行看右边”，就可以调用子类中的eat()方法
    @Override
    public void eat(){
        System.out.println("子类吃"+this.food);
        super.eat();
    }

    // 这个方法就是子类独有的方法，不可以animal an = new cat();之后an.age()想使用多态中的 “成员方法执行看右边”，否则会报错
    // 那我就是想animal an = new cat();之后使用an.age()怎么办呢 -- 需要进行向下转型
    public void age(){
        System.out.println("子类"+this.age+"岁");
    }
}
