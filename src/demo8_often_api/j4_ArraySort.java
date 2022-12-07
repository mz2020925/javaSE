package demo8_often_api;

import java.util.Arrays;

public class j4_ArraySort {
    public static void main(String[] args) {
        int[] arr = {24, 23, 56, 1, 3, 7, 10, 90};
        System.out.println(Arrays.toString(arr));
        // 冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
