package demo28_Scale_Binary_BitCalculate;

import java.math.BigDecimal;
import java.math.RoundingMode;

/*
* 用于小数的精确运算
* */
public class j9_BigDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.2");
        System.out.println(b1.add(b2));  // 加法
        System.out.println(b1.subtract(b2));  // 减法
        System.out.println(b1.multiply(b2));  // 乘法
        System.out.println(b1.divide(b2));  // 除法
        System.out.println("----------------");
        // 进一步讲解除法
        /*
        * RoundingMode.UP -- 进一法，只要指定小数位后面一位不是零就向前进一
        * RoundingMode.FLOOR -- 舍九法，不管指定小数位后面一位是多少都舍去
        * RoundingMode.HALF_UP -- 四舍五入
        *
        * */
        b1 = new BigDecimal("10.");
        b2 = new BigDecimal("3.");
        System.out.println(b1.divide(b2,2));  // b1是被除数，b2是除数，9是指定结果小数点后面保留几位
        System.out.println(b1.divide(b2,2,RoundingMode.UP));
        System.out.println(b1.divide(b2,2,RoundingMode.FLOOR));
        System.out.println(b1.divide(b2,2,RoundingMode.HALF_UP));






    }
}
