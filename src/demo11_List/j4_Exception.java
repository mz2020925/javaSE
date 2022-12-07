package demo11_List;

import java.util.ArrayList;
import java.util.List;

public class j4_Exception {
    public static void main(String[] args) {
        // ArrayList并发修改异常
        List<String> ls = new ArrayList<String>();

        ls.add("hello");
        ls.add("java");
        ls.add("python");
        ls.add("C++");
        ls.add("Golong");

        /*// 使用迭代器进行遍历会报并发修改异常，为什么呢？直观上理解，迭代器创建那一刻它就已经固定是当时那个集合的迭代器，
        // 现在你又追加一个元素，就修改了集合，集合不再是原来的集合了，迭代器怎么去遍历呢
        // 代码是因为，next()方法会做一个ModCount ! =expectedModCount判断，若满足就会抛出并发修改异常， 但get()不会做这个判断
        Iterator<String> ite = ls.iterator();
        while (ite.hasNext()){
            String s = ite.next();
            if (s.equals("java")){
                ls.add("C");  // 注意这里不是调用iterator迭代器的add()方法，iterator迭代器是没有add()方法的。
                                // 这里是调用List<String> ls = new ArrayList<String>();中的ls.add()方法来添加的
            }
        }
        */


        for (int i = 0; i < ls.size(); i++) {
            String s = ls.get(i);
            if (s.equals("java")){
                ls.add("C#");  // 这里是调用ls（List<String> ls = new ArrayList<String>();）的add方法，把元素追加到最后
            }
        }
        System.out.println(ls);
    }
}
