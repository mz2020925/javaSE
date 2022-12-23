package demo26_reflection;


/*
* 获取Class类对象的三种方式 -- （三种方式获取字节码文件对象）
* */
public class j2_reflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //使用类的class属性来获取该类对应的Class对象
        Class<j2_Student> c1 = j2_Student.class;
        System.out.println(c1);

        Class<j2_Student> c2 = j2_Student.class;
        System.out.println(c1 == c2);
        System.out.println(c1.equals(c2));

        //调用对象的getClass()方法，返回该对象所属类对应的Class对象
        j2_Student j2Student = new j2_Student();
        Class<? extends j2_Student> c3 = j2Student.getClass();
        System.out.println(c1 == c3);

        //使用Class类中的静态方法forName(String className)
        // 这种方式常用于配置中
        Class<?> c4 = Class.forName("demo26_reflection.j2_Student");
        System.out.println(c1 == c4);

    }
}
