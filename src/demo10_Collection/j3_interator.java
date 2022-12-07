package demo10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class j3_interator {
    public static void main(String[] args) {
        // Collection集合遍历 -- 用的是Iterator迭代器，集合的专用迭代方式
        // Iterator迭代器是一个对象，是通过Collection的方法创建的，所以说它是依赖于集合而存在的
        // Iterator, Collection -- Collection是继承于Iterator，它们都是接口，都具有抽象性

        // 创建Collection引用 = ArrayList对象
        Collection<String> strCol = new ArrayList<>();
        // 添加元素
        strCol.add("java");
        strCol.add("python");
        strCol.add("C++");
        strCol.add("Golong");
        strCol.add("C");

        // 创建了Iterator对象
        Iterator<String> strIt = strCol.iterator();
        // 1.next() -- Iterator的方法
        System.out.println(strIt.next());
        System.out.println(strIt.next());

        // 2.hasNext() -- 判断下一个是否有元素,然后在打印next()
        if (strIt.hasNext()){
            System.out.println(strIt.next());
        }

        // 3.打印输出集合中的所有元素

        while (strIt.hasNext()){
            // 这个地方并不是从头开始输出集合，而是接着上面输出
            System.out.println(strIt.next());
        }



    }
}
