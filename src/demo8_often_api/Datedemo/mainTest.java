package demo8_often_api.Datedemo;

import java.text.ParseException;
import java.util.Date;

public class mainTest {
    public static void main(String[] args) throws ParseException {
        // 日期转字符串
        Date date = new Date();
        String str = DateUtils.dateToString(date, "yyyy-MM-dd hh:mm:ss");
        System.out.println(str);
        String str2 = DateUtils.dateToString(date, "hh:mm:ss");
        System.out.println(str2);

        System.out.println("--------");
        // 字符串转日期
        String s = "2008-8-9 12:23:45";
        Date date1 = DateUtils.stringToDate(s,"yyyy-MM-dd hh:mm:ss");
        System.out.println(date1);
    }
}
