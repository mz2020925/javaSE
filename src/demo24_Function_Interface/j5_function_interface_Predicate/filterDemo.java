package demo24_Function_Interface.j5_function_interface_Predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class filterDemo {
    public static void main(String[] args) {
        String[] strArray = {"林青霞,30", "柳岩,34", "张曼玉,35", "貂蝉,31", "王祖贤,33"};

        /*
         有两个判断条件,所以需要使用两个Predicate接口,对条件进行判断
         必须同时满足两个条件,所以可以使用and方法连接两个判断条件
        * */
        ArrayList<String> arrList = myFilter(strArray, s -> s.split(",")[0].length() > 2,
                s -> Integer.parseInt(s.split(",")[1]) >= 33);

        for (String s : arrList) {
            System.out.println(s);
        }
    }

    private static ArrayList<String> myFilter(String[] strArray, Predicate<String> pre1, Predicate<String> pre2) {
        // 定义一个集合
        ArrayList<String> arrList = new ArrayList<>();

        // 遍历数组
        for (String s : strArray) {
            if (pre1.and(pre2).test(s)) {
                arrList.add(s);
            }
        }
        return arrList;
    }
}
