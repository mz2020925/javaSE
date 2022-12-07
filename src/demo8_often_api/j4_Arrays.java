package demo8_often_api;


import java.util.Arrays;

public class j4_Arrays {
    public static void main(String[] args) {
        // java的API中Arrays类
        int[] arr = {1, 23, 45, 2, 70, 100};
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
