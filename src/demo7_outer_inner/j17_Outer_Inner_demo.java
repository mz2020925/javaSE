package demo7_outer_inner;

public class j17_Outer_Inner_demo {
    public static void main(String[] args) {
        j17_Outer_Inner.inner in = new j17_Outer_Inner().new inner();  // 这里创建的对象是内部类inner的对象
        in.show();  // 我想在另一个类中调用public修饰的inner内部类的show方法，可以像上面创建内部类对象之后调用；但是这种方式是不能创建private修饰的内部类并调用其成员方法的

        j17_Outer_Inner oi = new j17_Outer_Inner();
        oi.usepriinner();  // 想要访问private修饰的内部类，必须依靠外部类的成员方法useinner去创建内部类，

    }

}
