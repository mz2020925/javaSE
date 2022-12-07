package demo11_List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class j3_StudentDemo {
    public static void main(String[] args) {
        List<j3_Student> lsStu = new ArrayList<j3_Student>();

        lsStu.add(new j3_Student("zmz", 45));
        lsStu.add(new j3_Student("jyf", 32));
        lsStu.add(new j3_Student("ngq", 10));

        // 三种遍历方式
        // 1.迭代器
        Iterator<j3_Student> iteStu = lsStu.iterator();
        while (iteStu.hasNext()) {
            j3_Student item = iteStu.next();
            System.out.println(item.getName() + " " + item.getAge());
        }

        // 2.foreach -- 这种方式的内部原理是Iterator迭代器
        for (j3_Student item :
                lsStu) {
            System.out.println("名字：" + item.getName() + "年龄：" + item.getAge());
        }

        // 3.fori
        for (int i = 0; i < lsStu.size(); i++) {
            System.out.println(lsStu.get(i).getName() + " " + lsStu.get(i).getAge());
        }
    }
}
