package demo26_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class j8_getMethod_example {
    public static void main(String[] args) {
        Class<?> c = null;
        try {
            // 1.获取Class对象
            c = Class.forName("demo26_Reflection.j2_Student");
            // 2.通过获取公共无参构造方法对象，创建对象
            Constructor<?> con = c.getConstructor();
            Object obj = con.newInstance();

            // 3.通过获取成员方法对象，调用对应的成员方法
            // 3.1调用公共成员方法method1
            Method method1 = c.getMethod("method1");
            method1.invoke(obj);

            // 3.2调用公共成员方法method2
            Method method2 = c.getMethod("method2", String.class);
            method2.invoke(obj, "张明志");

            // 3.3调用公共成员方法method3
            Method method3 = c.getMethod("method3", String.class, int.class);
            Object returnObj = method3.invoke(obj, "张三", 23);
            System.out.println(returnObj);

            // 3.4调用私有成员方法function
            Method function = c.getDeclaredMethod("function");
            function.setAccessible(true);
            function.invoke(obj);


        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }




    }
}
