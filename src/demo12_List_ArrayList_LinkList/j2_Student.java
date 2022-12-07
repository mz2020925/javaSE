package demo12_List_ArrayList_LinkList;

import java.util.Iterator;
import java.util.LinkedList;

public class j2_Student {
    public static void main(String[] args) {
        LinkedList<String> lklsStr = new LinkedList<>();

        lklsStr.add("111");
        lklsStr.add("222");
        lklsStr.add("333");
        lklsStr.add("444");

        // 1.
        Iterator<String> lkIte = lklsStr.iterator();
        while (lkIte.hasNext()){
            System.out.println(lkIte.next());
        }

        System.out.println("----------");
        // 2.
        for (String item :
                lklsStr) {
            System.out.println(item);
        }

        System.out.println("--------");
        // 3.
        for (int i = 0; i < lklsStr.size(); i++) {
            System.out.println(lklsStr.get(i));
        }
    }
}
