package demo14_LinkedHashSet_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

public class j5_TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<j5_student> tsJ5stu = new TreeSet<>(new Comparator<j5_student>() {
            @Override
            public int compare(j5_student o1, j5_student o2) {
                int num = o2.getSum() - o1.getSum(); // 传参的时候o1后面，说明o2是后一个对象，o1是前一个对象，
                                                    // return的时候用o2减去o1，若结果大于0，则o2排在前面，若结果小于0，则o2排在后面，所以是降序
                                                    // return的时候用o1减去o2，若结果大于0，则o2排在前面，若结果小于0，则o2排在后面，所以是升序

                int num2 = num == 0 ? o2.getChinese() - o1.getChinese() : num;
                int num3 = num2 == 0 ? o2.getName().compareTo(o1.getName()) : num2;
                return num3;
            }
        });

        // 创建学生对象
        j5_student stu1 = new j5_student("zmz", 123, 145);
        j5_student stu2 = new j5_student("z", 123, 146);
        j5_student stu3 = new j5_student("mz", 100, 145);
        j5_student stu4 = new j5_student("zz", 123, 145);
        j5_student stu5 = new j5_student("xmz", 80, 100);
        j5_student stu6 = new j5_student("zmz", 123, 145);

        // 添加对象到集合
        tsJ5stu.add(stu1);
        tsJ5stu.add(stu2);
        tsJ5stu.add(stu3);
        tsJ5stu.add(stu4);
        tsJ5stu.add(stu5);
        tsJ5stu.add(stu6);

        for (j5_student stu :
                tsJ5stu) {
            System.out.println(stu.getName() + ", " + stu.getChinese() + ", " + stu.getMath() + ", " + stu.getSum());
        }


    }
}
