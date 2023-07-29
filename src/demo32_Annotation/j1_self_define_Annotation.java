package demo32_Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
这是一个自定义注解
    格式如下。

注解的本质：
    反编译的内容如下：
    public interface j1_self_define_Annotation extends Annotation{
    }
    注解的本质是一个接口，该接口默认继承Annotation接口；
    既然是接口，纳秒内部定义的内容就是接口中可以定义的内容；
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface j1_self_define_Annotation {
    /*
    在接口中我们定义抽象方法：
    void show();
    String show();
    在注解中定义“属性”类似这样的形式：
    返回值类型 属性名() [default 默认值];  // 返回值类型就是注解“属性”类型，[]表示可省略的代码
    返回值类型可以是：基本数据类型、String、枚举类型、注解类型、Class类型、以上类型的一维数组类型。
    */
    String name() default "zmz";
    int age();
    float[] nums();
}
