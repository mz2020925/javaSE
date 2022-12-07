package demo1_baseRules;

import java.util.Arrays;

public class j6_array {
    public static void main(String[] args) {
        // 动态初始化，
        // 下面这个初始化语句，左边会在栈内存中创建一个arr局部变量，使用完立即释放，
        // 右边会在堆内存中开辟一片空间，使用完会由垃圾回收器来释放
        // arr指向这片空间的首地址
        int[] arr = new int[10];
        System.out.println(arr);
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));


        // 静态初始化
        int[] arr2 = new int[]{10, 20, 30, 40, 50};
        System.out.println(arr2 + ":" + Arrays.toString(arr2));


        // 静态初始化简化格式
        int[] arr3 = {60, 70, 80, 90, 100};
        System.out.println(arr3 + ":" + Arrays.toString(arr3));
        int len = arr3.length;  // 数组长度在new完之后就不能变化了
        System.out.println(len);

        // 调用方法打印数组
        printArray(arr3);

        // 调用方法获取数组
        int[] arr4 = returnArray(12, 13, 14);
        System.out.println(Arrays.toString(arr4));

        // 利用上面两个方法将，数组反转，此方法已经将原数组改变了
        arr4 = reverseArray(arr3);
        System.out.println("arr3" + Arrays.toString(arr3));
        System.out.println("arr4" + Arrays.toString(arr4));

        // 调用方法获取数组最大值
        int maxnum = getMaximum(arr4);
        System.out.println(maxnum);


    }

    // 打印数组方法
    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j+" ");
        }
        System.out.println();
    }

    //  方法获取数组
    public static int[] returnArray(int a, int b, int c) {
        return new int[]{a, b, c};
    }

    //  数组反转
    public static int[] reverseArray(int[] arr){
        // 把数组arr3反转
        for (int start = 0, end = arr.length - 1; start < end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        return arr;
    }

    // 获取数组最大值
    public static int getMaximum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
