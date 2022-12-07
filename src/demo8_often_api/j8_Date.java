package demo8_often_api;

import java.util.Date;

public class j8_Date {
    public static void main(String[] args) {
        // 创建Date类的对象，也会自动调用Date类的构造方法哦
        Date d1 = new Date();
        System.out.println(d1);

        long date = 1000 * 60 * 60;  // 1000ms * 60 = 60s, 1000 * 60 * 60 = 60s * 60 = 1min * 60 = 1hour
        Date d2 = new Date(date);  // 这样传date参数进去会发生：返回--从1970年起始时间开始算，过了date这段时间后，的时间
        System.out.println(d2);

        System.out.println("---------Date常用方法getTime()");
        // Date常用方法getTime()
        Date d3 = new Date();
        System.out.println("打印d3对象:" + d3);
        long d3Time = d3.getTime();
        System.out.println(d3Time);  // 毫秒值
        System.out.println(d3Time * 1.0 / 1000 / 60 / 60 / 24 / 365 + "年");

        System.out.println("--------Date常用方法setTime()");
        // Date常用方法setTime()
        long temp = 1000 * 60 * 60;
        d3.setTime(temp);  // 这样传temp参数进去会发生：返回--从1970年起始时间开始算，过了date这段时间后，的时间
        System.out.println(d3);

        long time = System.currentTimeMillis();
        d3.setTime(time);
        System.out.println(d3);
    }
}
