package demo26_reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;


/* 反射获取构造方法并使用--Class类获取构造方法对象的方法

Constructor<?>[] getConstructors()  --  返回所有公共构造方法对象的数组

Constructor<?>[] getDeclaredConstructors()  --  返回所有构造方法对象的数组

Constructor getConstructor(Class<?>... parameterTypes)  --  返回单个公共构造方法对象

Constructor getDeclaredConstructor(Class<?>... parameterTypes)  --  返回单个构造方法对象
* */
public class j3_getConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("demo26_reflection.j2_Student");

        // 1.Constructor<?>[] getConstructors()
        // 返回一个包含Constructor对象的数组，Constructor对象反映了由该Class对象表示的类的所有公共构造函数
        Constructor<?>[] cons = c.getConstructors();
        for (Constructor<?> con : cons) {
            System.out.println(con);
        }

        // 2.Constructor<?>[] getDeclaredConstructors()
        // 返回反映由该Class对象表示的类声明的所有构造函数的Constructor对象的数组
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for (Constructor<?> con : cons2) {
            System.out.println(con);
        }

        // 3.Constructor<T> getConstructor(Class<?>... parameterTypes)
        // 返回一个Constructor对象，该对象反映由该Class对象表示的类的指定公共构造函数
        Constructor<?> con = c.getConstructor();  // 这里得到的是公共无参构造方法
        Object obj = con.newInstance();
        System.out.println(obj);
        // 上述通过反射，提供类的全路径，然后通过Class.forName获得字节码文件对象c，再通过c调用getConstructor得到单个公共无参构造方法对象con，
        // 在利用公共无参构造方法对象con调用newInstance创建对象得到obj，
        // 和下面方式创建对象得到的stu是一样的
        j2_Student stu = new j2_Student();
        System.out.println(stu);


    }
}
