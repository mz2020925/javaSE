package demo24_Function_Interface.j2_as_formal_parameter_and_return;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
* 函数式接口作为方法的返回值（换句话说，方法的返回值式函数式接口类型） -- 此时返回值可以用Lambda表达式来返回
* */
public class ComparatorDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("cccc");
        arrayList.add("aaa");
        arrayList.add("bb");
        arrayList.add("ddddddd");
        System.out.println(arrayList);

        // 没有指定比较器，就按照自然排序
        Collections.sort(arrayList);
        System.out.println(arrayList);

        // 指定比较器，就按照比较器排序
        Collections.sort(arrayList, getComparator());
        System.out.println(arrayList);
    }

    private static Comparator<String> getComparator(){
        // 1.接口的匿名内部类的方式实现 -- 接口的匿名内部类的重点不在内部，而在于它在写了接口的实现类的代码、重写了抽象方法、然后创建对象
        // Comparator<String> comp = new Comparator<>(){
        //     @Override
        //     public int compare(String s1, String s2){
        //         return s1.length() - s2.length();
        //     }
        // };
        // return comp;

        // 2.简化接口的匿名内部类
        // return new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         return o1.length() - o2.length();
        //     }
        // };

        // 3.使用Lambda表达式实现
        // return (String s1, String s2)->{
        //     return s1.length() - s2.length();
        // };

        // 4.使用Lambda表达式实现的简化
        return (s1, s2)->s1.length() - s2.length();
        // 上面的代码相当于Comparator<String> comp = (s1, s2)->s1.length() - s2.length();
        // Lambda表达式的作用有写了接口的实现类、重写了抽象方法、创建了实例化对象，然后吧对象作为返回值返回，
        // 这个返回值的类型是《函数式接口》类型。



    }
}
