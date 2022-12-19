package demo25_Stream;

import java.util.ArrayList;

public class j1_StreamDemo {
    public static void main(String[] args) {
        // 1.创建一个集合，存储多个字符串元素
        ArrayList<String> strArrList = new ArrayList<>();
        strArrList.add("林青霞");
        strArrList.add("张曼玉");
        strArrList.add("王祖贤");
        strArrList.add("柳岩");
        strArrList.add("张敏");
        strArrList.add("张明志");

        // 2.把集合中所有以"张"开头的元素存储到一个新的集合
        ArrayList<String> strArrList2 = new ArrayList<>();
        for (String s : strArrList) {
            if (s.startsWith("张")) {
                strArrList2.add(s);
            }
        }

        // 3.把"张"开头的集合中的长度为3的元素存储到一个新的集合
        ArrayList<String> strArrList3 = new ArrayList<>();
        for (String s : strArrList2) {
            if (s.length() == 3) {
                strArrList3.add(s);
            }
        }
        for (String s : strArrList3) {
            System.out.println(s);
        }

        // 4.使用Stream流来改进
        strArrList.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
    }
}
