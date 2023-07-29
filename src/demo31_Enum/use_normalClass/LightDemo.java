package demo31_Enum.use_normalClass;

public class LightDemo {
    public static void main(String[] args) {
        // 自定义枚举类模式一、无参构造方法
        Light red = Light.RED;
        System.out.println(red);
        System.out.println("----------------");

        // 自定义枚举类模式二、带参构造方法
        Light2 red2 = Light2.RED;
        System.out.println(red2);
        String name = red2.getName();
        System.out.println(name);
        System.out.println("----------------");

        // 自定义枚举类模式三、
        Light3 red3 = Light3.RED;
        System.out.println(red3);
        System.out.println(red3.getName());
        red3.show();
    }
}
