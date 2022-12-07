package demo23_Lambda.j4_Lambda_InnerClass;

public class j4_LambdaDemo {
    public static void main(String[] args) {
        // 1.匿名内部类作为参数可用于实现接口、实例化抽象类、实例化普通类（具体类）
        useAnimal(new Animal() {
            @Override
            public void eat() {
                System.out.println("实例化抽象类");
            }
        });
        useDog(new Dog(){
            @Override
            public void eatMeat(){
                // 重写了具体类中的方法
                System.out.println("实例化具体类");
            }
        });
        // 目前只有匿名内部类这里可以怎么写：new 接口名()，前面Lambda表达式都不能这么写
        // 因为接口本身是不能实例化的，
        useInter(new Inter() {
            @Override
            public void speakEnglish() {
                System.out.println("实现接口");
            }
        });

        // 2.Lambda表达式作为参数，只能实现接口
        // 它的作用依次包括--写了实现接口的类、重写了抽象方法、然后多态创建了实例化接口的对象、最后该对象被传给方法useAdd()
        // 对象传给方法useAdd()之后，若useAdd()方法体内有 引用名.方法名 来调用接口中的抽象方法，则执行Lambda表达式所蕴含的重写方法代码
        useInter(()->{
            System.out.println("这个接口的唯一抽象方法没有输入参数和返回值，所以使用Lambda表达式来实现按这个接口的时候，" +
                    "方法体中只能写一些打印输出代码");
        });




    }

    private static void useInter(Inter inter) {
        inter.speakEnglish();
    }

    private static void useDog(Dog dog) {
        dog.eatMeat();
    }

    private static void useAnimal(Animal animal) {
        animal.eat();
    }

}