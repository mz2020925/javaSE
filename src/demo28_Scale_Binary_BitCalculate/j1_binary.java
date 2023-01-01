package demo28_Scale_Binary_BitCalculate;

public class j1_binary {
    public static void main(String[] args) {
        // 1.进制展示
        // 0b--二进制
        // 0--八进制
        // 0x--十六进制
        // 不加--十进制
        System.out.println(0b10000000000);
        System.out.println(02000);
        System.out.println(0x400);
        System.out.println(1024);

        System.out.println("---------");
        // 2.进制转换
        int num = 1024;
        // 2.1给定的数转换成固定进制
        System.out.println(Integer.toBinaryString(num));  // 转换为二进制
        System.out.println(Integer.toOctalString(num));  // 转换为8进制
        System.out.println(Integer.toHexString(num));  // 转换为16进制

        System.out.println("---------");
        // 2.2给定的数转换成任意进制
        System.out.println(Integer.toString(num, 2));  // 转换为二进制
        System.out.println(Integer.toString(num, 8));  // 转换为8进制
        System.out.println(Integer.toString(num, 16));  // 转换为16进制
        System.out.println(Integer.toString(num, 32));  // 转换为32进制

    }
}
