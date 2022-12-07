package demo14_LinkedHashSet_TreeSet;

import java.util.TreeSet;

public class j2_TreeSet {
    // 我们在Set讲完之后讲的这几个(子类)集合，如TreeSet，都是Set接口的实现类
    // TreeSet可以实现集合元素的自然排序，注意不是数据追加的顺序，具体的排序方式取决于构造方法
    // TreeSet也是不包含重复元素的
    // 不能使用索引

    public static void main(String[] args) {
        TreeSet<Integer> tsInt = new TreeSet<>();// TreeSet<>尖括号中是引用类型，索引不能使用int

        tsInt.add(109);
        tsInt.add(90);
        tsInt.add(-9);
        tsInt.add(-8);
        tsInt.add(-18);

        System.out.println(tsInt);

        //

    }





}
