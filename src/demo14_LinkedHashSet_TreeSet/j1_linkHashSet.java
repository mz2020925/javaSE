package demo14_LinkedHashSet_TreeSet;

import java.util.LinkedHashSet;

public class j1_linkHashSet {
    public static void main(String[] args) {
        // 这种结构通过链表实现了集合中 增添和输出 的元素顺序一样
        // 但是仍然元素不会重复
        LinkedHashSet<Double> lkhsDou = new LinkedHashSet<>();

        lkhsDou.add(90.98);
        lkhsDou.add(86.91);
        lkhsDou.add(0.96);
        lkhsDou.add(9.9);
        lkhsDou.add(90.98);

        for (Double item :
                lkhsDou) {
            System.out.println(item);
        }

    }
}
