package demo28_Scale_Decimal;

import java.util.Scanner;

public class j6_multiplication_judge_even {
    public static void main(String[] args) {
        // 最右效率的方式计算2乘以8的结果
        System.out.println(2 << 3);  // 2 * 2^3

        // 判断是否位偶数
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if ((a & 1) == 0) {
            System.out.println("是偶数");
        } else if ((a & 1) == 1) {
            System.out.println("是奇数");
        }
    }
}
