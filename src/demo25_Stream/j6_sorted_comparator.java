package demo25_Stream;

import java.util.ArrayList;

public class j6_sorted_comparator {
    public static void main(String[] args) {
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("linqingxia");
        strArrList.add("zhangmanyu");
        strArrList.add("wangzuxian");
        strArrList.add("liuyan");
        strArrList.add("zhangmin");
        strArrList.add("zhangwuji");

        // 需求1：按照字母顺序把数据在控制台输出
        strArrList.stream().sorted().forEach(System.out::println);
        System.out.println("--------");
        // 需求2：按照字符串长度把数据在控制台输出
        // public abstract Stream<T> sorted(java.util.Comparator<? super T> comparator)
        strArrList.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println("--------");
        // 需求3：先按字符串长度排序，再按自然排序
        strArrList.stream().sorted((s1,s2)->{
            int num = s1.length() - s2.length();
            int num2 = (num==0)?s1.compareTo(s2):num;
            return num2;
        }).forEach(System.out::println);

    }
}
