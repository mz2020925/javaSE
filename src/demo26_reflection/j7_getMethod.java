package demo26_reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
* 反射获取成员方法并使用
Method[] getMethods()  返回所有公共成员方法对象的数组，包括继承的

Method[] getDeclaredMethods()  返回所有成员方法对象的数组，不包括继承的

Method getMethod(String name, Class<?>...parameterTypes)  返回单个公共成员方法对象

Method getDeclaredMethod(String name, Class<?>...parameterTypes)  返回单个成员方法对象
* */
public class j7_getMethod {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象
            Class<?> c = Class.forName("demo26_reflection.j2_Student");
            // 2.方法getMethods() -- 获取本类和所继承的类 的公共成员方法
            Method[] methods = c.getMethods();
            for (Method method : methods) {
                System.out.println(method);
            }

            System.out.println("--------");
            // 2.方法getDeclaredMethods() -- 获取本类的所有成员方法
            Method[] methods2 = c.getDeclaredMethods();
            for (Method method : methods2) {
                System.out.println(method);
            }

            System.out.println("--------");
            // 3.方法getMethod() -- 获取本类和所继承的类 的公共成员方法中的一个方法
            Method method2 = c.getMethod("method1");
            // 获取无参构造方法创建对象
            Constructor<?> con = c.getConstructor();
            Object obj = con.newInstance();
            // Object invoke(Object obj, Object... args) 在具有指定参数的指定对象上调用此方法对象表示的基础方法
            // Object：返回值类型
            // obj：调用方法的对象
            // args：方法需要的参数
            method2.invoke(obj);

            // 4.方法getDeclaredMethod() -- 获取本类所有成员方法中的一个方法

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
