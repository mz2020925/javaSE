package demo24_Function_Interface.j1_example;

public class MyInterfaceDemo {
    public static void main(String[] args) {
        MyInterface myInter = () -> System.out.println("Lambda表达式做了那些事？写了实现接口的类、重写了接口的唯一抽象方法show、" +
                "创建了实例化类的对象，最后将该对象以多态形式赋给myInter");
        myInter.show();  // 这里的show()方法已经被Lambda表达式重写了。
    }
}
