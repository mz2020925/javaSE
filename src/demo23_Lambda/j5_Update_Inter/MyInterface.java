package demo23_Lambda.j5_Update_Inter;

public interface MyInterface {
    void show1();
    void show2();
    // 这是jkd8之后，接口更新的新功能，这叫做默认方法，不是抽象方法，所以必须有方法体，但是可以被重写
    public default void show3(){
        System.out.println("这是默认方法show3()");
    }
}
