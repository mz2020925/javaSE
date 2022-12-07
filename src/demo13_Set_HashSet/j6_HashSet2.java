package demo13_Set_HashSet;

import java.util.HashSet;

public class j6_HashSet2 {
    public static void main(String[] args) {
        HashSet<j5_Student> hsStu = new HashSet<>();

        hsStu.add(new j5_Student("zmz",45));
        hsStu.add(new j5_Student("yue",90));
        hsStu.add(new j5_Student("ytr",15));
        hsStu.add(new j5_Student("zmz",45));


        // 这时HashSet中存储着相同的对象j5_Student("zmz",45)
        for (j5_Student stu:
             hsStu) {
            System.out.println(stu.toString());
        }

//        System.out.println("--------");
//        // 如何避免上述情况呢？需要重写j5_Student类的hashCode()方法
//        for (j5_Student stu:
//                hsStu) {
//            System.out.println(stu.toString());
//        }

    }
}
