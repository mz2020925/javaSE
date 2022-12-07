package demo5_implements;

public class cat extends animal implements jumpping{

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void age() {

    }

    @Override
    public void jump() {
        System.out.println("猫跳高");
    }
}
