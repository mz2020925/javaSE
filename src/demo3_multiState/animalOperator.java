package demo3_multiState;

public class animalOperator {
    public void useAnimal(animal animal){
        // 当cat c = new cat();执行后的c被传进来的时候，相当于发生了animal animal = new cat();
        // 那么下面这条语句调用方法就是 “执行看右边”，执行的是cat类中的方法eat()，而且看右边执行子类的成员方法必须是重写的成员方法
        animal.eat();
    }
}
