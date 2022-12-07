package demo10_Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class j6_Collections_student_sort {
    private static class Student {  // 采用内部类的方式来建立Student类
        private String name;
        private int age;

        public Student() {
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


    public static void main(String[] args) {
        ArrayList<Student> arrListStu = new ArrayList<>();

        // 创建学生对象
        Student stu1 = new Student("zmz", 82);
        Student stu2 = new Student("weqq", 42);
        Student stu3 = new Student("xdf", 8);
        Student stu4 = new Student("zngf", 23);

        // 把学生添加到集合
        arrListStu.add(stu1);
        arrListStu.add(stu2);
        arrListStu.add(stu3);
        arrListStu.add(stu4);

        //
        // 使用Collections的sort()方法，对ArrayList集合排序
        // sort•(List<T> list, Comparator<? super T> c)
        Collections.sort(arrListStu, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
                // 传参的时候o1后面，说明o2是后一个对象，o1是前一个对象，
                // return的时候用o2减去o1，若结果大于0，则o2排在前面，若结果小于0，则o2排在后面，所以是降序
                // return的时候用o1减去o2，若结果大于0，则o2排在前面，若结果小于0，则o2排在后面，所以是升序
                int num = o1.getAge() - o2.getAge();
                int num2 = num==0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });
        for(Student stu: arrListStu){
            System.out.println(stu.getName()+", "+stu.getAge());
        }

    }
}
