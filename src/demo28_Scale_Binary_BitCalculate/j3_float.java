package demo28_Scale_Binary_BitCalculate;

import java.math.BigDecimal;

public class j3_float {
    public static void main(String[] args) {
        // 1.浮点数的二进制与十进制的相互转换

        // 2.浮点数再计算机中的存储方式s--控制符号, E--控制科学计数法指数, M--控制有效数字(1.xxxxx不要整数部分的1以节约空间,只存储xxxxx)
        // float--占据32bit, double--占据64bit

        // 3.浮点数运算之结果错误
        System.out.println(2.0f-1.5f);
        System.out.println(2.0f-1.3f);
        // 2.0f-1.3f结果不对的原因：1.3f的小数0.3转换成二进制小数是无限循环小数，存入计算机时只能按照float的有效数字进行截取。从而出现了舍入误差。
        System.out.println(2.0f-1.4f);
        // 2.0f-1.4f计算过程中也会出现舍入误差，但是恰好结果与0.6f的规范化二进制表示一模一样，所以结果打印是0.6

        // 4.如何避免float和double的精度丢失情况？使用java.math.BigDecimal中的方法。
        BigDecimal bd1 = new BigDecimal("2.0");
        BigDecimal bd2 = new BigDecimal("1.3");
        BigDecimal bd3 = bd1.subtract(bd2);
        System.out.println(bd3);

    }
}
