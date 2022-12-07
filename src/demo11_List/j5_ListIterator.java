package demo11_List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class j5_ListIterator {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("zmz");
        ls.add("yua");
        ls.add("nud");
        ls.add("java");
        ls.add("python");
        ls.add("C++");

        // 1.顺序遍历
        ListIterator<String> lsIte = ls.listIterator();
        while (lsIte.hasNext()){
            System.out.println(lsIte.next());
        }

        // 2.倒序遍历
        System.out.println("---------");
        while (lsIte.hasPrevious()){
            System.out.println(lsIte.previous());
        }


        // 3.再次检验并发修改异常，这次使用ListIterator迭代器，不会报异常
        // 虽然它的add()方法做了ModCount ! =expectedModCount判断(它是在add()方法中做的)，但是，add()方法会这样赋值expectedModCount = ModCount，
        // 这样做之后，ModCount ! =expectedModCount判断就不会成立，也就不会报异常了
        ListIterator<String> lsIte2 = ls.listIterator();
        while (lsIte2.hasNext()){
            String s = lsIte2.next();
            if (s.equals("yua")){
                lsIte2.add("zmmmzmzmmz");  // 这个地方add()不是把元素追加在最后的，
                                            // 这里的add()和上一个文件中的（List<String> ls = new ArrayList<String>();）ls.add()方法内容是不一样
            }
        }
        System.out.println(ls);

        // 4.使用增强for each -- 内部原理是一个Iterator迭代器，那么我们检验它是否会发生 并发修改异常
        for (String item:
             ls) {
            if (item.equals("java")){
                ls.add("Golong");
            }
        }


    }
}
