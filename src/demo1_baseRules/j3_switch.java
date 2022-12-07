package demo1_baseRules;

import java.util.Scanner;

public class j3_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数据");
        int i = scanner.nextInt();
        switch (i){
            case 1:
                System.out.println("1");
            case 2:
                System.out.println("2");
            default:
                System.out.println("输入数字不正确！");
        }

        System.out.println();
    }
}
