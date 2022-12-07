package demo8_often_api;

import java.util.Calendar;

public class j10_Calendar {
    public static void main(String[] args) {
        // Calendar是抽象类，Calendar字段（成员变量/属性）有static修饰，成员方法没有static修饰
        Calendar calendar = Calendar.getInstance();  // 这句代码其实是使用了多态的，即等式右边是创建一个Calendar子类的对象，复制给左边Calendar父类引用
        System.out.println(calendar);


        // Calendar字段
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + month + "月" + day + "日");

        System.out.println("--------");
        //  Calendar成员方法add()
        calendar.add(Calendar.YEAR, -3);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH, -3);
        System.out.println(calendar.get(Calendar.MONTH) + 1);

        System.out.println("--------");
        //  Calendar成员方法set()
        calendar.set(2046, 11,11);  // 第二个参数表示月份，11表示12月，也可以用英文Calendar.DECEMBER表示
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));

    }
}
