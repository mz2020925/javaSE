package demo10_Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class j4_StudentDemo {
    public static void main(String[] args) {
        // 创建集合对象
        Collection<j4_Student> stuCol = new ArrayList<j4_Student>();

        // 添加元素
        stuCol.add(new j4_Student("zmz",32));
        stuCol.add(new j4_Student("asfd",67));
        stuCol.add(new j4_Student("yue",45));

        // System.out.println(stuCol);  // 这里打印的是地址，其实集合中存储的三个对象的应用
        Iterator<j4_Student> stuIt = stuCol.iterator();
        while (stuIt.hasNext()){
            j4_Student student = stuIt.next();
            System.out.println(student.getName()+student.getAge());

        }
        // 上述代码可简化为 -- 这样的话就不会用到迭代器
        /*for (j4_Student student : stuCol) {
            System.out.println(student.getName() + student.getAge());
        }*/
     }
}
