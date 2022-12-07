package demo15_T;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class j7_use_varible_parameter {
    public static void main(String[] args) {
        // public static <T> List<T> asList(T... a) {} -- 返回由参数中指定的数组a构成的，大小（长度）不可变，元素可修改的列表List
        List<String> list1 = Arrays.asList("hello","world","java");
        // 这里创建的list是不能add()和remove()，但可以set()--修改
        // list.add("javaee");//UnsupportedOperationException
        // list.remove("java");//UnsupportedOperationException
        list1.set(1,"javaee");

        // public static <E> List<E> of(E... element) {} -- 返回由参数中指定的数组element构成的，大小不可变，且元素不可变的列表List
        List<String> list2 = List.of("hello", "world", "java");

        //public static <E> Set<E> of(E... elements) ：返回由参数中指定的数组element(给的数组不能有重复元素)构成的，
        // 大小不可变，且元素不可变(Set集合没有set根据索引修改元素的方法)的列表Set
        Set<String> set = Set.of("hello", "world", "java");

    }
}
