package demo26_Reflection.j10_reflect_txt;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class reflectDemo {
    public static void main(String[] args) {
        // j10_Student stu = new j10_Student();
        // stu.study();
        //
        // j10_Teacher teacher = new j10_Teacher();
        // teacher.teach();

        // 下面通过配置文件的方式实现上述功能，先演示配置文件的使用
        Properties prop = new Properties();
        try {
            FileReader fr = new FileReader("src\\demo26_reflection\\j10_reflect_txt\\conf.txt");
            prop.load(fr);
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
         className=com.itheima_06.Student
         methodName=study
        */
        // String className = prop.getProperty("className1");
        // String methodName = prop.getProperty("methodName1");
        String className = prop.getProperty("className2");
        String methodName = prop.getProperty("methodName2");

        // 下面演示反射的使用
        try {
            Class<?> c = Class.forName(className);
            Constructor<?> con = c.getConstructor();
            Object obj = con.newInstance();
            Method m = c.getMethod(methodName);
            m.invoke(obj);

        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }



    }
}
