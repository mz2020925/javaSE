package demo24_Function_Interface.j3_function_interface_Supplier;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class getMaxDemo {
    public static void main(String[] args) {
        //  定义一个int数组
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        });

        System.out.println(maxValue);

    }

    private static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }


}
