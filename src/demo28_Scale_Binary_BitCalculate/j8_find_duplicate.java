package demo28_Scale_Binary_BitCalculate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class j8_find_duplicate {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = new int[101];
        // 设定重复元素
        Random random = new Random();
        arr[0] = random.nextInt(100) + 1;
        System.out.println("给定重复元素" + arr[0]);
        // 给数组剩下的元素赋值
        for (int i = 1; i < arr.length; i++) {  // i=1,2,...100
            arr[i] = i;
        }

        // int[]数组转换成Integer[]数组
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        // Integer[]数组转换成List<Integer>
        List<Integer> list = Arrays.asList(integers);
        // 然后打乱顺序
        Collections.shuffle(list);
        // List<Integer>集合转换成int[]数组
        int[] disorderArr = list.stream().mapToInt(Integer::valueOf).toArray();

        // 找出重复元素
        // 方法一：两层循环遍历，Outer:--循环的别名
        Outer:
        for (int i = 0; i < disorderArr.length; i++) {
            for (int j = i + 1; j < disorderArr.length; j++) {
                if (disorderArr[i] == disorderArr[j]) {
                    System.out.println("重复元素是" + disorderArr[i]);
                    break Outer;
                }
            }
        }
        // 方式二：求和再减取1~99
        int sum = Arrays.stream(disorderArr).sum();
        int subSum = IntStream.rangeClosed(1, 100).sum();
        int res = sum - subSum;
        System.out.println("重复元素是" + res);

        // 方法三：异或运算符
        int res2 = 0;
        for (int j : disorderArr) {
            res2 ^= j;  // 所有元素相互异或一遍存入res2，重复元素异或结果为0(两个相同的数异或等于0)，相当于没有参与这次异或运算
        }
        res2 ^= IntStream.rangeClosed(1, 100).reduce((x, y) -> x ^ y).orElse(0);
        System.out.println("重复元素是" + res2);
    }

    /*java将int数组转化为Integer数组
     * 示例：int[] --> Integer[]
     * int[] arr = {1, 2, 3, 4, 5};
     * Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
     * */
    public static Integer[] intArrayToInteger(int[] nums) {
        //初始化int数组
        // int[] nums = {1, 2, 3, 4, 5, 6};
        //将int数组转换为数值流
        IntStream stream = Arrays.stream(nums);
        //流中的元素全部装箱，转换为Integer流
        Stream<Integer> integerStream = stream.boxed();
        //将流转换为数组
        Integer[] integers = integerStream.toArray(Integer[]::new);

        // 上面是分解步骤，实际应用中一行代码即可解决
        // Integer newNums[] = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        return integers;
    }

    /*该函数中方法二：java将Integer数组转化为int数组
     * 示例：Integer[] --> int[]
     * int[] ints = Arrays.stream(integers).mapToInt(Integer::valueOf).toArray();
     * */
    public static int[] randomOrder(Integer[] integers) {
        List<Integer> list = Arrays.asList(integers);
        Collections.shuffle(list);
        // 方式一：
        int[] ints = list.stream().mapToInt(Integer::valueOf).toArray();
        return ints;

        // 方式二：
        // Integer[] array = (Integer[]) list.toArray();
        // Arrays.stream(array).mapToInt(Integer::valueOf).toArray();
    }


}
