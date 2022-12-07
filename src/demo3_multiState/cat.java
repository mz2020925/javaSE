package demo3_multiState;

public class cat extends animal{
    // 子类重写了父类的方法，在使用多态时，就发生了对于成员方法编译看左边，执行看右边，那么怎么利用这个特性呢？
    // 在mainclass中使用animalOperator对象的useAnimal方法时就用到了这个特性。
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}
