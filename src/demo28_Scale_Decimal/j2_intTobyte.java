package demo28_Scale_Decimal;

public class j2_intTobyte {
    public static void main(String[] args) {
        // 1.整数(int)强制转换为byte之数据溢出
        // int类型占据4个字节(也就是32bit)的存储空间，
        // 130会被以补码(正数的原码、反码、补码都是其本身)的形式存入内存中(就是130化成32位的二进制原码，再转换成补码存储)。
        // 强制转换为byte会截取(内存中130对应的的32位的补码的)最低8位的二进制数(10000010-补)，
        // 把这8位补码存入bytNum的内存(显然看出此时补码对应的原码是一个负数)，打印byteNum时，内存中的补码转换为原码得11111110，
        // (10000010得符号位不变，数值位减1再逐位取反得到)，再转换为10进制显示再输出框-126。
        int intNum = 130;
        byte byteNum = (byte) intNum;
        System.out.println(byteNum);

    }
}
