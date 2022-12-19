package demo25_Stream;

import java.util.ArrayList;

public class j4_limit_skip {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("林青霞");
        strArrList.add("张曼玉");
        strArrList.add("王祖贤");
        strArrList.add("柳岩");
        strArrList.add("张敏");
        strArrList.add("张无忌");

        // 需求1：取前3个数据在控制台输出
        strArrList.stream().limit(3).forEach(System.out::println);
        System.out.println("--------");
        // 需求2：跳过3个元素，把剩下的元素在控制台输出
        strArrList.stream().skip(3).forEach(System.out::println);
        System.out.println("---------");
        //需求3：跳过2个元素，把剩下的元素中前2个在控制台输出
        strArrList.stream().skip(3).limit(2).forEach(System.out::println);
    }
}
