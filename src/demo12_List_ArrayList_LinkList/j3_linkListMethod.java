package demo12_List_ArrayList_LinkList;

import java.util.LinkedList;

public class j3_linkListMethod {
    public static void main(String[] args) {
        LinkedList<String> lklsStr = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            lklsStr.add(String.valueOf(i));
        }
        System.out.println(lklsStr);

        // 1.getFirst
        System.out.println(lklsStr.getFirst());

        // 2.getLast
        System.out.println(lklsStr.getLast());

        // 3.removeFirst
        System.out.println(lklsStr.removeFirst());

        // 4.removeLast
        System.out.println(lklsStr.removeLast());

        // 5.
        System.out.println(lklsStr);



    }
}
