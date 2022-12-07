package demo7_noneInnerClass;

public class mainDemo2 {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        jo.method(new Jumpping() {  //这个地方用到了匿名内部类，通过这种方式创建了一个实现该接口的实例对象，并传过去，
                                    // 之前我们说不能直接new 接口名,但这里这样用是因为这是以一个匿名内部类的形式，直接在函数形参传参位置创建了一个实现接口的类
            @Override
            public void jump() {
                System.out.println("猫可以跳高了");  // 在这个匿名实例对象中直接创建成员方法
            }
        });
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });
    }

}
