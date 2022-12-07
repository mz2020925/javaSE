package demo11_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j6_listTraversal {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();

        ls.add("java");
        ls.add("python");
        ls.add("C++");
        ls.add("Golong");
        ls.add("PHP");

        // 1.迭代器
        Iterator<String> lsStr = ls.iterator();
        while (lsStr.hasNext()){
            System.out.println(lsStr.next());
        }

        System.out.println("---------");
        // 2.fori
        for (int i = 0; i < ls.size(); i++) {
            System.out.println(ls.get(i));
        }

        System.out.println("----------");
        // 3.foreach
        for (String item :
                ls) {
            System.out.println(item);
        }
    }
}
