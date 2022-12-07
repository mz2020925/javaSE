package demo8_often_api;

import java.util.Arrays;

public class j6_StringSort {
    public static void main(String[] args) {
        String str1= "91 92 94 80 5 6 28 -19";
        String[] strArray = str1.split(" ");
        int[] arr = new int[strArray.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                sb.append(arr[i]);
            }else {
                sb.append(arr[i]).append(" ");
            }

        }
        String str = sb.toString();
        System.out.println(str);
    }
}
