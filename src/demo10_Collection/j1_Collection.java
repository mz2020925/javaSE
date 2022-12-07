package demo10_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class j1_Collection {
    public static void main(String[] args) {
        // 创建Collection集合接口的 对象来实现它，是使用多态进行
        Collection<String> c = new ArrayList<String>();  // 泛型<E>表示集合中数据的类型

        // 添加元素,boolean add(E e)
        c.add("hello");
        c.add("java");
        c.add(("python"));

        // 输出集合对象
        System.out.println(c);

    }
}
