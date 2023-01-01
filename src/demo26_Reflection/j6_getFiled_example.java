package demo26_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class j6_getFiled_example {
    public static void main(String[] args) {
        try {
            // 1.获取Class对象，获取字节码文件对象
            Class<?> c = Class.forName("demo26_Reflection.j2_Student");
            //
            Constructor<?> con = c.getConstructor();
            Object obj = con.newInstance();
            System.out.println(obj);

            //
            Field nameField = c.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(obj, "张明志");
            System.out.println(obj);

            Field ageField = c.getDeclaredField("age");
            ageField.setAccessible(true);
            ageField.set(obj, 23);
            System.out.println(obj);

            Field addressField = c.getDeclaredField("address");
            addressField.setAccessible(true);
            addressField.set(obj, "安徽");
            System.out.println(obj);


        } catch (ClassNotFoundException |
                NoSuchMethodException |
                InstantiationException |
                IllegalAccessException |
                InvocationTargetException |
                NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
