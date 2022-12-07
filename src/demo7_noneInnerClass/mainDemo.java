package demo7_noneInnerClass;

public class mainDemo {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.method();  // 在另一个类中是不能直接调用匿名内部类中的方法的
    }

}
