package demo10_Collection;

import java.util.ArrayList;
import java.util.Collection;

public class j2_CollectionMethod {
    public static void main(String[] args) {
        // Collection接口 常用方法
        Collection<String> c = new ArrayList<String>();

        // 1.add方法,返回值是boolean
        c.add("hello");
        c.add("java");
        c.add("python");
        c.add("C++");
        System.out.println(c.add("golong"));
        System.out.println(c);

        // 2.remove方法 -- 返回boolean值
        System.out.println(c.remove("java"));
        System.out.println(c);

        // 3.contains -- 判断集合中是否存在指定元素
        System.out.println("集合中是否存在python元素：" + c.contains("python"));

        // 4.判断集合对象是否为空
        System.out.println("集合对象是否为空" + c.isEmpty());

        // 5.返回集合对象的长度
        c.add("C++");
        c.add("C");
        c.add("golong");
        System.out.println("集合的长度为"+c.size());

        // 6.clear方法 -- 清空c中所有的元素
        c.clear();
        System.out.println(c);

        //

    }
}
