package demo8_often_api;

import java.lang.reflect.Type;

public class j5_Integer_String_to_Int {
    public static void main(String[] args) {
        // 过时构造方法
        Integer integer = new Integer(100);
        System.out.println(integer);

        //  新版创建Integer对象的方式
        Integer integer1 = Integer.valueOf(100);
        // Integer integer1 = 100;  // 这样写和上面那行等价
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf("190");
        System.out.println(integer2);

        // 报错
        // Integer integer3 = Integer.valueOf("abc");
        // System.out.println(integer3);

        // 方式一：int 转换成 String
        int num = 100;
        String s1 = ""+num;
        System.out.println(s1);

        // 方式二：通过创建String对象将int（可以是其他类型）转换成String
        String str = String.valueOf(90999);
        System.out.println(str);

        // 方式一：String转换成int
        Integer integer3 = Integer.valueOf("1000");
        // int integer3 = Integer.valueOf("1000");  // 这样写和上面那行等价
        int x = integer3.intValue();  // 使用非静态方法，通过创建的对象调用
        // int x = integer3;  // 这样写和上面那行等价
        System.out.println(x);
        // 方式二：通过Integer类直接调用静态方法
        int y = Integer.parseInt("9028");
        System.out.println(y);









    }
}
