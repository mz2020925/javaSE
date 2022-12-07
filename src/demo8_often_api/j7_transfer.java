package demo8_often_api;

public class j7_transfer {
    public static void main(String[] args) {
        // 装箱和拆箱都是一种 包装类类型与基本类型之间的转换。有点类似于向上转型和向下转型
        // 手动装箱
        Integer integer = Integer.valueOf(109);
        // 自动装箱 -- 装箱是指把 基本数据类型 转换成 包装类类型
        Integer integer1 = 109;

        // 拆箱
        int num = integer1.intValue() + 91;
        // 自动拆箱 -- 拆箱是指把 包装类数据类型 转换成 基本数据类型
        integer1 += 91; // 这里integer1不能是null！--只要是对象（引用），在使用前一定要判断是否为null

    }
}
