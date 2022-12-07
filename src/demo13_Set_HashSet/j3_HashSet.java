package demo13_Set_HashSet;

import java.util.HashSet;

public class j3_HashSet {
    public static void main(String[] args) {
        // Set接口（具有抽象性）的的一个实现类HashSet，即HashSet implements Set
        HashSet<Float> hsflo = new HashSet<>();

        hsflo.add((float) 3.0);
        hsflo.add((float) 2.098);
        hsflo.add((float) 3.409);
        hsflo.add((float) 3.0);

        // 遍历
        for (Float item :
                hsflo) {
            System.out.println(item + " " + item.getClass());
        }

    }
}
