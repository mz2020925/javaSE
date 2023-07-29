package demo34_Junit;

/*
 * 自定义数学类，对两个数进行加减乘除。
 * 在TestJunit文件夹中对这个类进行测试。
 * */
public class j1_MyMath {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
}
