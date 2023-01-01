package demo26_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class j4_getConstructor2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 1.获取字节码文件对象
        Class<?> c = Class.forName("demo26_Reflection.j2_Student");

        // 2.得到公共带参构造方法对象con，注意getConstructor的参数类型要是对应的Class类型
        // 基本数据类型也可以通过.class得到对应的Class类型
        Constructor<?> con = c.getConstructor(String.class, int.class, String.class);  // 这里得到的是公共带参构造方法
        // 3.利用公共带参构造方法对象con调用newInstance创建对象
        Object obj = con.newInstance("张明志",22,"安徽");
        System.out.println(obj);

        // 4.得到非公共带参构造方法对象con，注意getConstructor的参数类型要是对应的Class类型
        Constructor<?> con2 = c.getDeclaredConstructor(String.class);
        // 5.利用公共带参构造方法对象con调用newInstance创建对象
        con2.setAccessible(true);  // 暴力反射--public void setAccessible(boolean flag):值为true，取消访问检查,可以使用私有构造方法进行创建对象
        Object obj2 = con2.newInstance("张明志");
        System.out.println(obj2);
    }
}
