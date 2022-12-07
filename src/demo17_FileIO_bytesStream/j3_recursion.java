package demo17_FileIO_bytesStream;

public class j3_recursion {
    public static void main(String[] args) {
        /* 递归的基本使用
         * 以编程的角度来看，递归指的是方法定义中调用方法本身的现象
         * 把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
         * 递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算
         * */
        // 回顾不死神兔问题，求第20个月兔子的对数
        // 每个月的兔子对数：1,1,2,3,5,8，...
        int[] arr = new int[20];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[19]);  // 这里的19是数组的索引
        // 使用递归解决问题
        System.out.println(fun(20));  // 这里的传递参数是第 20 个月

        // 使用递归求解阶乘
        System.out.println(fun2(4));
        System.out.println(fun2(5));
    }

    /*
    递归解决问题，首先就是要定义一个方法：
        定义一个方法f(n)：表示第n个月的兔子对数
        那么，第n-1个月的兔子对数该如何表示呢？f(n-1)
        同理，第n-2个月的兔子对数该如何表示呢？f(n-2)
    注意：
        递归一定要有出口。否则内存溢出
        递归虽然有出口，但是递归的次数也不宜过多。否则内存溢出
        StackOverflowError:当堆栈溢出发生时抛出一个应用程序递归太深
    */
    public static int fun(int n) {
        if (n == 1 || n == 2) {  // 递归出口--结束条件
            return 1;
        } else {  // 递归体
            return fun(n - 1) + fun(n - 2);
        }
    }

    // 定义一个方法，用于递归求阶乘，参数为一个int类型的变量
    public static int fun2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * fun2(n - 1);
        }
    }

}
