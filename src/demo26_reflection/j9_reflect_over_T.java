package demo26_reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/*
* 通过反射技术，向一个泛型为Integer的集合中添加一些字符串数据
* */
public class j9_reflect_over_T {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(20);
        arrList.add(205);

        Class<? extends ArrayList> c = arrList.getClass();
        try {
            Method add = c.getMethod("add", Object.class);
            // 通过反射可以越过泛型检查（或者说是类型检查）， 原始add()方法本身需要的是Object类型，因此可以传String类型给他
            add.invoke(arrList, "hello");
            add.invoke(arrList, "world");

            System.out.println(arrList);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
