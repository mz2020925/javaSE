package demo1_baseRules;

import java.util.ArrayList;

public class j12_arrayLIst {
    // 字符串是一种不可修改的数据，所以有了StringBuilder()
    // 数组的长长度在定义时已经固定，不能修改，所以有了arrayList
    public static void main(String[] args) {
        ArrayList<String> arrls = new ArrayList<>();
        System.out.println(arrls);

        arrls.add("hello");
        arrls.add("w");
        arrls.add("world");
        System.out.println(arrls);

        arrls.add(1, "s");
        System.out.println(arrls);

        arrls.remove("world");
        arrls.remove("z");  // 删除失败返回false
        arrls.remove(0);  // 删除索引0元素并返回该元素

        ArrayList<String> arrls2 = new ArrayList<>();
        arrls2.add("zmz");
        arrls2.add("zzzz");
        arrls2.add("mmmmmm");
        for (int i = 0; i < arrls2.size(); i++) {
            String s = arrls2.get(i);
            System.out.println(s);
        }
        // 上述for循环可使用以下简化方式进行
        for (String s : arrls2) {
            System.out.println(s);
        }

    }
}
