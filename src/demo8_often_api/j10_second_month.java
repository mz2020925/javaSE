package demo8_often_api;

import java.util.Calendar;
import java.util.Scanner;

public class j10_second_month {
    public static void main(String[] args) {
        // 键盘输入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();

        // 创建日历对象，并设置日历对象的年、月、日
        Calendar c = Calendar.getInstance();
        c.set(year, Calendar.MARCH,1);

        // 3月1日往前推一天，就是2月的最后一天
        c.add(Calendar.DATE, -1);

        // 获取这一天输出即可
        int date = c.get(Calendar.DATE);

        System.out.println(year + "年的2月份有"+date+"天");
    }

}
