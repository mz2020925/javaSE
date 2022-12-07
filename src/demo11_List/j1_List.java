package demo11_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j1_List {
    // 有序的，可重复的
    public static void main(String[] args) {
        // 创建集合对象
        List<String> list = new ArrayList<String>();
        // 添加元素 -- add()相当于append()
        list.add("C");
        list.add("python");
        list.add("java");
        list.add("Golong");
        // 输出集合对象
        System.out.println(list);

        // List遍历也是有迭代器Iterator
        Iterator<String> lsIt = list.iterator();
        while (lsIt.hasNext()){
            System.out.println(lsIt.next());
        }
        /*for (String item :
                list) {
            System.out.println(item);
        }*/


    }
}
