package demo29_jdk8_date_time;

import java.time.LocalDateTime;

public class j1_LocalDateTime {
    public static void main(String[] args) {
        // 1.LocalDateTime没有构造方法，通过下面的静态方法获取对象
        // 1.1public static LocalDateTime now()，从默认时区中的系统时钟获取当前日期时间。

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);  // 2023-01-01T12:16:19.524078200 -- T表示时间开始，精确到纳秒

        // 1.2public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)，以给定额年月日时分秒获取LocalDateTime对象
        LocalDateTime of = LocalDateTime.of(2023, 1, 1, 12, 26, 56);
        System.out.println(of);


    }
}
