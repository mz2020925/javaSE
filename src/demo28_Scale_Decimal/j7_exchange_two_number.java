package demo28_Scale_Decimal;

public class j7_exchange_two_number {
    public static void main(String[] args) {
        // 不适用第三个变量交换两个变量的值
        int a = 10;
        int b = 100;
        System.out.println(a + "," + b);

        a = a ^ b;  // a_temp = a ^ b;
        b = a ^ b;  // b = a_temp ^ b = a ^ b ^ b = a;
        a = a ^ b;  // a = a_temp ^ b = a_temp ^ a = a ^ b ^ a = b;

        System.out.println(a + "," + b);
    }
}
