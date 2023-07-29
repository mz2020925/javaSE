package demo32_Annotation;

@j1_self_define_Annotation(age = 9, nums = {1.f, .3f, 3f})
public class j1_self_define_Annotation_Usage {
}
/*
使用自定义注解的注意事项：
    1.如果注解有多个属性，则可以在注解括号中用“,”号隔开分别给对应的属性赋值
    2.如果定义属性时，使用default关键字给属性默认初始化值，则使用注解时，可以不进行属性的赋值
    3.如果只有一个属性需要赋值,并且属性的名称是value,则value可以省略，直接定义值即可
    4.数组赋值时，值使用{}包裹。如果数组中只有- -个值，则{}可以省略

* */