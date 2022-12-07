package demo14_LinkedHashSet_TreeSet;

import java.util.TreeSet;

public class j3_Comparable {
    public static void main(String[] args) {
        TreeSet<j3_student> tsJ3stu = new TreeSet<>();
        // 创建j3_student对象
        j3_student j3Stu3 = new j3_student("zy",18);
        j3_student j3Stu4 = new j3_student("xy",18);  // 年龄相同，按照姓名进行排序
        j3_student j3Stu1 = new j3_student("zmz",23);
        j3_student j3Stu2 = new j3_student("zmh",16);

        j3_student j3Stu5 = new j3_student("zy",18);  // 年龄和姓名相同，同一个对象，不添加


        tsJ3stu.add(j3Stu1);
        tsJ3stu.add(j3Stu2);
        tsJ3stu.add(j3Stu3);
        tsJ3stu.add(j3Stu4);
        tsJ3stu.add(j3Stu5);

        for (j3_student stu :
                tsJ3stu) {
            System.out.println(stu.getName()+", "+stu.getAge());
        }
    }
}
