package demo23_Lambda.j5_Update_Inter;


/*
默认方法不是抽象方法，所以不强制被重写。但是可以被重写，重写的时候不加default关键字
public可以省略，default不能省略
* */
public class mainDemo {
    public static void main(String[] args) {
        MyInterface myInter = new MyClassImpl1();
        myInter.show1();
        myInter.show2();
        myInter.show3();
    }
}
