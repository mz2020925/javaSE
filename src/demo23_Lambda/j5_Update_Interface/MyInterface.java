package demo23_Lambda.j5_Update_Interface;

public interface MyInterface {
    // 普通抽象方法
    void show1();
    void show2();

    // 默认方法：这是jkd8之后，接口更新的新功能，这叫做默认方法，不是抽象方法，所以必须有方法体，但是可以被重写
    public default void show3(){
        System.out.println("这是接口中的默认方法show3()");
    }

    // 静态方法：
    public static void show4(){
        System.out.println("这是接口中的静态方法show4()");
    }

    // 私有方法--情形：抽取重复代码函数体写成私有方法供接口中的默认方法调用，
    // 普通抽象方法没有方法体，谈不上调用，静态方法是不能调用非静态方法的。
    private void show5(){
        System.out.println("这是接口中的私有方法show5()");
    }

    // 私有静态方法--情形：私有静态方法既可以被默认方法调用，也可以被静态方法调用
    private static void show6(){
        System.out.println("这是接口中的私有静态方法show5()");
    }
}
