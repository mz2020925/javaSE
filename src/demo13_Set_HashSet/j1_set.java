package demo13_Set_HashSet;

import java.util.HashSet;
import java.util.Set;

public class j1_set {
    public static void main(String[] args) {
        // set集合是不能使用索引的，不包含重复元素的集合，不保证存储和取出的数据顺序一直
        Set<Integer> setInt = new HashSet<Integer>();

        setInt.add(123);
        setInt.add(32);
        setInt.add(90);
        setInt.add(123);
        setInt.add(0);
        System.out.println(setInt);

        System.out.println("--------");
        for (Integer item :
                setInt) {
            System.out.println(item);
        }

        // HashSet对集合的迭代顺序不做任何保证
        System.out.println("--------");
        for (Integer item :
                setInt) {
            System.out.println(item);
        }
    }
}
