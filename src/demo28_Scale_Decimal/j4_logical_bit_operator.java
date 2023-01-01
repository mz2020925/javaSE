package demo28_Scale_Decimal;

public class j4_logical_bit_operator {
    public static void main(String[] args) {
        /*
         * 位运算--就是直接对整数再内存中的二进制位进行操作
         * 注意：这里的运算是在内存中的运算，是使用补码进行计算的，而且符号位也参与运算，补码运算体系下，符号位是参与运算的！
         * */
        System.out.println(intToBinary32(3, 32)+"  3的二进制补码");
        System.out.println(intToBinary32(4, 32)+"  4的二进制补码");

        // &--位与（逻辑运算符 在这里做“数字运算”时被当作 位运算符）
        int res = 3 & 4;  // xxx0011 & xxx 0100，
        // 要注意，位与运算之前要先把十进制数字转换为二进制，然后转换为补码，然后用补码进行运算，得到结果也是补码，结果转换成原码，然后转换成十进制数，最后赋给res。
        System.out.println(intToBinary32(res, 32));

        // |--位或
        res = 3 | 4;
        System.out.println(intToBinary32(res, 32));

        // ^--位异或：不同返1，相同返0
        res = 3 ^ 4;
        System.out.println(intToBinary32(res, 32));

        // ~--位取反：按位取反，
        // *注意：这里的运算是在内存中的运算，是使用补码进行计算的
        res = ~3;
        System.out.println(intToBinary32(res, 32));
    }


    public static String intToBinary32(int num, int bitNum) {
        StringBuilder binaryStr = new StringBuilder(Integer.toBinaryString(num));
        while (binaryStr.length() < bitNum) {
            binaryStr.insert(0, "0");
        }
        return binaryStr.toString();
    }

}
