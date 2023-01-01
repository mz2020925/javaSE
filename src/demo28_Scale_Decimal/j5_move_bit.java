package demo28_Scale_Decimal;

public class j5_move_bit {
    public static void main(String[] args) {
        /*
        * 原码是我们思考的方式，补码是计算机思考的方式，但最终结果(十进制数)是一样的。
        * 计算机中的移位操作是操作补码的，但是得到结果和原码移位是一样的。
        * 因为计算机是用补码运算的，补码运算中符号位参与运算，但是原码(我们思考的方式)的符号位不参与移位运算。
        *
        * */
        // 1.<< --左移，补码移位：补码符号位参与运算，高位丢弃，低位补0，
        int res = 3<<2;
        System.out.println(res+"  3左移两位的结果(十进制)");
        System.out.println(intToBinary(3,32)+"  3的二进制补码");
        System.out.println(intToBinary(res, 32)+"  3的二进制补码左移29位");
        System.out.println("----------------------------------------");

        res = -4<<29;
        System.out.println(res+"  -4左移29位的结果(十进制)");
        System.out.println(intToBinary(-4,32)+"  -4的二进制补码");
        System.out.println(intToBinary(res, 32)+"  -4的二进制补码左移两位");
        System.out.println("----------------------------------------");

        // 2.>> --右移，补码移位：补码符号位参与运算，正数左补0，负数左补1，补码符号位参与运算
        res = 3>>2;
        System.out.println(res+"  3右移两位的结果(十进制)");
        System.out.println(intToBinary(3,32)+"  3的二进制补码");
        System.out.println(intToBinary(res, 32)+"  3的二进制补码右移两位");
        System.out.println("----------------------------------------");

        res = -3>>2;
        System.out.println(res+"  -3右移两位的结果(十进制)");
        System.out.println(intToBinary(-3,32)+"  -3的二进制补码");
        System.out.println(intToBinary(res, 32)+"  -3的二进制补码右移两位");
        System.out.println("----------------------------------------");

        // 3.>>> --无符号右移(补码中符号位当成数值位)，不论该数正负，右移左补0
        res = 3>>>2;
        System.out.println(res+"  3无符号右移两位的结果(十进制)");
        System.out.println(intToBinary(3,32)+"  3的二进制补码");
        System.out.println(intToBinary(res, 32)+"  3的二进制补码无符号右移两位");
        System.out.println("----------------------------------------");

        res = -3>>>2;
        System.out.println(res+"  -3无符号右移两位的结果(十进制)");
        System.out.println(intToBinary(-3,32)+"  -3的二进制补码");
        System.out.println(intToBinary(res, 32)+"  -3的二进制补码无符号右移两位");

    }

    public static String intToBinary(int num, int bitNum){
        StringBuilder strBuilder = new StringBuilder(Integer.toBinaryString(num));
        while (strBuilder.length()<bitNum){
            strBuilder.insert(0, "0");
        }
        return strBuilder.toString();
    }
}
