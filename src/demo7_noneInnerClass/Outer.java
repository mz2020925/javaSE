package demo7_noneInnerClass;

public class Outer {

    public void method(){
        new Inner(){  // 这是一个实例对象，只是这个对象没有应用指向它。匿名内部类的本质是一个继承该类(new后面的那个)或实现该接口的没有名字的实例对象
            @Override
            public void show() {
                System.out.println("匿名内部类1");
            }
        }.show();  // 调用show方法的方式一，show方法是匿名内部类的中的方法，

        Inner in = new Inner(){  // 这个地方的多态就直接new 接口名,这和前面的用多态实现接口的方式不一样，前面是先创建一个具体类implements这个接口，然后用多态
            @Override
            public void show() {
                System.out.println("匿名内部类2");
            }
        };
        in.show();  // 调用show方法的方式二
    }
}
