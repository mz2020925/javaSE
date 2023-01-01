package demo29_JDK8_LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class j2_DateTimeFormatter {
    public static void main(String[] args) {
        // 1.DateTimeFormatter.ofPattern静态方法 -- 把 LocalDateTime对象 按照规定形式，格式化打印到输出框
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = now.format(dateTimeFormatter);
        System.out.println(format);  // 2023-01-01 12:58:35

        // 1.1使用链式编程代替上面的分开写的代码
        String format1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(format1);  // 2023-01-01 12:58:35

        // 2.parse静态方法 -- 把给定字符串按照指定形式创建出LocalDateTime对象
        // String s = "2023/0101 12:39:45";  // 字符串分隔符号要和ofPattern的参数匹配
        String s = "2023-01-01 12:39:45";
        LocalDateTime parse = LocalDateTime.parse(s, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(parse);  // 2023-01-01T12:39:45
    }
}
