package demo12_List_ArrayList_LinkList;

import java.util.ArrayList;
import java.util.LinkedList;

public class j1_arrayList_linkList {
    public static void main(String[] args) {
        // ArrayList -- 查询快（用索引），删除和增添慢
        // LinkList -- 查询慢，删除和增添快

        // 1.创建ArrayList集合
        ArrayList<String> arlsStr = new ArrayList<>();
        arlsStr.add("java");
        arlsStr.add("python");
        arlsStr.add("C++");
        for (String item :
                arlsStr) {
            System.out.println(item);
        }

        System.out.println("----------");
        // 2.创建LinkList集合
        LinkedList<String> lklsStr = new LinkedList<>();
        lklsStr.add("zmz");
        lklsStr.add("zmh");
        lklsStr.add("ksm");
        lklsStr.add("zzc");
        for (String item :
                lklsStr) {
            System.out.println(item);
        }
    }
}
