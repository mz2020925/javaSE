package demo8_often_api.Datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    工具类中：
    只有无参构造方法且私有修饰 -- 这样会造成不允许外界创建对象
    成员方法静态
 */
public class DateUtils {
    private DateUtils(){}

    public static String dateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);  // 在使用SimpleDateFormat类时创建对象要给一个表示日期格式的参数
        return sdf.format(date);
    }

    public static Date stringToDate(String str,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);  // 在使用SimpleDateFormat类时创建对象要给一个表示日期格式的参数
        return sdf.parse(str);
    }



}
