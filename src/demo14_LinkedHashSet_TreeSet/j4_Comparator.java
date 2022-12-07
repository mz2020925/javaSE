package demo14_LinkedHashSet_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class j4_Comparator {
    public static void main(String[] args) {
        // 实现j3_Comparable中的排序还有另外一种方法，通过TreeSet的带参构造方法，匿名内部类（这里new Comparator是实现了接口Comparator）的方式来
        // 前面我们是在j3_student对象中重写了comparaTo方法，是在j3_student对象中做手脚，这里是利用TreeSet带参构造方法，这里是在TreeSet实例类上做手脚
        TreeSet<j3_student> tsJ3stu = new TreeSet<>(new Comparator<j3_student>() {
            @Override
            public int compare(j3_student o1, j3_student o2) {  // 这里面重写了compare方法，注意Comparator和Comparable
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;

                return num2;
            }
        });

        // 创建j3_student对象
        j3_student j3Stu3 = new j3_student("zy", 18);
        j3_student j3Stu4 = new j3_student("xy", 18);  // 年龄相同，按照姓名进行排序
        j3_student j3Stu1 = new j3_student("zmz", 23);
        j3_student j3Stu2 = new j3_student("zmh", 16);

        j3_student j3Stu5 = new j3_student("zy", 18);  // 年龄和姓名相同，同一个对象，不添加


        tsJ3stu.add(j3Stu1);
        tsJ3stu.add(j3Stu2);
        tsJ3stu.add(j3Stu3);
        tsJ3stu.add(j3Stu4);
        tsJ3stu.add(j3Stu5);

        for (j3_student stu :
                tsJ3stu) {
            System.out.println(stu.getName() + ", " + stu.getAge());
        }
    }
}
