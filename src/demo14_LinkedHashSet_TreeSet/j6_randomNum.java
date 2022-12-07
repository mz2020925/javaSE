package demo14_LinkedHashSet_TreeSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class j6_randomNum {
    public static void main(String[] args) {
        // 使用多态，创建Set引用 = HashSet对象
        // Set<Integer> hsInt = new HashSet<>();
        Set<Integer> hsInt = new TreeSet<>(); // TreeSet不仅可以实现HashSet所实现的东西，还可以自动自然排序
        // 创建随机数对象
        Random rd = new Random();

        // 创建长度为10的集合的随机数
        while (hsInt.size() < 10) {
            // 随机产生1~20的随机数，加入集合
            int num = rd.nextInt(20) + 1;  // 注意这里要加1
            hsInt.add(num);
        }

        System.out.println(hsInt);
    }
}
