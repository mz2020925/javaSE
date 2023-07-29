package demo32_Annotation;

import java.util.Arrays;

/*
1.获取字节码文件对象，获取谁的呢?谁使用了注解,就获取谁的
    Class<MyAnnotationTest> C = MyAnnotationTest.class;
2.获取字节码对象上的注解对象
    MyAnnotation annotation = c.getAnnotation(MyAnnotation.class);
3.解析注解，获得注解的属性
    String name = annotation.name();
    int age = annotation.age();
* */
@j1_self_define_Annotation(age = 9, nums = {1.f, .3f, 3f})
public class j2_self_define_Annotation_Parse {
    public static void main(String[] args) {
        // 通过反射解析注解

        // 获取字节码文件对象，获取谁的呢?谁使用了注解,就获取谁的
        Class<j2_self_define_Annotation_Parse> aClass = j2_self_define_Annotation_Parse.class;

        // 通过字节码文件对象获取注解对象
        j1_self_define_Annotation annotation = aClass.getAnnotation(j1_self_define_Annotation.class);

        // 解析注解，获得注解的属性
        String name = annotation.name();
        int age = annotation.age();
        float[] nums = annotation.nums();

        System.out.println("name = " + name+", "
                +"age = " + age+", "
                +"nums = " + Arrays.toString(nums));
    }
}
