package demo10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class j5_Collections_sort_reverse_shuffle {
    public static void main(String[] args) {
        // 创建List引用 = ArrayList对象；
        List<Integer> list = new ArrayList<>();

        // 添加元素
        list.add(30);
        list.add(40);
        list.add(90);
        list.add(300);
        list.add(10);
        list.add(600);

        // sort()
        Collections.sort(list);
        System.out.println(list);

        // reverse(list)
        Collections.reverse(list);
        System.out.println(list);

        // shuffle()
        Collections.shuffle(list);
        System.out.println(list);

    }
}
