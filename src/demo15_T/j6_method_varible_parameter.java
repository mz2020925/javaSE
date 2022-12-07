package demo15_T;

import java.util.ArrayList;

public class j6_method_varible_parameter {
    public static void main(String[] args) {
        System.out.println(summer(1,2,3,4,5));
        System.out.println(summer(1,2,3,4,50));
        System.out.println(summer(1.5,20.7,3,4,5));
        System.out.println(summer2("求和结果如下",1,2,3,4,5));
    }
    // 将函数的参数列表设置为不固定的，实际上a是一个“数组”，用来接收函数的参数
    public static int summer(double... a){
        int sum=0;
        for (double j : a) {
            sum += j;
        }
        return sum;
    }

    public static int summer2(String str, double... a){
        int sum=0;
        for (double j : a) {
            sum += j;
        }
        System.out.println(str);
        return sum;
    }
}
