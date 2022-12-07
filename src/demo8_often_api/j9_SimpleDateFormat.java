package demo8_often_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class j9_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        // 格式化输出：Date到String
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat();
        String s = sdf.format(d);
        System.out.println(s);
        // 进一步
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String s1 =sdf2.format(d);
        System.out.println(s1);

        // 解析String到Date
        String s2 = "2008-10-18 23:37:56";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  // 注意这里传参给带参构造方法的参数形式要和上面的字符串格式对应
        Date date = sdf3.parse(s2);  // 这里要在方法名后面写上，抛出异常
        System.out.println(date);


    }
}
