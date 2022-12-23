package demo25_Stream;

import javax.lang.model.element.NestingKind;
import java.util.ArrayList;

public class j8_forEach_count {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("林青霞");
        strArrList.add("张曼玉");
        strArrList.add("王祖贤");
        strArrList.add("柳岩");
        strArrList.add("张敏");
        strArrList.add("张无忌");

        //需求1：把集合中的元素在控制台输出
        strArrList.stream().forEach(System.out::println);

        //需求2：统计集合中有几个以张开头的元素，并把统计结果在控制台输出
        long count = strArrList.stream().filter(s -> s.startsWith("张")).count();
        System.out.println(count);

    }
}
