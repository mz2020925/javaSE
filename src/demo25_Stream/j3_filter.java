package demo25_Stream;

import java.util.ArrayList;

public class j3_filter {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("林青霞");
        strArrList.add("张曼玉");
        strArrList.add("王祖贤");
        strArrList.add("柳岩");
        strArrList.add("张敏");
        strArrList.add("张无忌");

        // 需求1：把list集合中以张开头的元素在控制台输出
        strArrList.stream().filter(s -> s.startsWith("张")).forEach(System.out::println);

        // 需求2：把list集合中长度为3的元素在控制台输出
        strArrList.stream().filter(s -> s.length() == 3).forEach(System.out::println);

        // 需求3：把list集合中以张开头的，长度为3的元素在控制台输出
        strArrList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
