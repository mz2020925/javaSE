package demo26_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/*
* 反射获取成员变量并使用
Field[] getFields()  返回所有公共成员变量对象的数组

Field[] getDeclaredFields()  返回所有成员变量对象的数组

Field getField(String name)  返回单个公共成员变量对象

Field getDeclaredField(String name)  返回单个成员变量对象
* */
public class j5_getFiled {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象 -- 获取字节码文件对象
            Class<?> c = Class.forName("demo26_Reflection.j2_Student");

            // 2.Field[] getFields(); 返回一个包含Field对象的数组，Field对象包括类或接口的所有可访问的公共字段
            Field[] fields = c.getFields();
            System.out.println(fields);
            System.out.println(Arrays.toString(fields));

            // 3.Filed[] getDeclaredFields(); 返回一个Field对象的数组，Field对象包括类或接口声明的所有字段
            Field[] fields2 = c.getDeclaredFields();
            System.out.println(Arrays.toString(fields2));

            System.out.println("---------");
            // 4.Filed getField(); 返回一个Field对象，Field对象包括类或接口声明的公共字段中的一个字段
            Field addressField = c.getField("address");  // 一个公共字段
            System.out.println(addressField);
            // 4.1如何使用拿到的这个Field对象?
            // 4.2先通过反射，获得一个公共无参构造方法对象
            Constructor<?> con = c.getConstructor();
            // 4.3再通过con创建j2_Student类对应的对象
            Object obj = con.newInstance();
            // 4.4再给该对象的成员变量赋值
            addressField.set(obj, "安徽");  // 给obj的成员变量addressField赋值为西安
            // 4.5打印查看该对象的情况
            System.out.println(obj.toString());

            System.out.println("---------");
            // 5.Filed getDeclaredField(); 返回一个Field对象，Field对象包括类或接口声明的所有字段中的一个字段
            Field nameField = c.getDeclaredField("name");  // 一个私有字段，但不能用来通过nameField.set(obj2, "张三")的方式给name赋值
            Constructor<?> defaultCon = c.getDeclaredConstructor(String.class, int.class);// 先通过反射，获得一个默认带参构造方法对象
            Object obj2 = defaultCon.newInstance("张明志", 23);
            j2_Student stu = (j2_Student) obj2;  // 向下转型，使用setName()方法给成员变量name赋值
            stu.setName("张三");
            System.out.println(obj2.toString());

            Field ageField = c.getDeclaredField("age");

        } catch (ClassNotFoundException |
                NoSuchFieldException |
                NoSuchMethodException |
                IllegalAccessException |
                InstantiationException |
                InvocationTargetException e) {
            e.printStackTrace();
        }


    }
}
