package demo30_Design_Mode;

import java.io.IOException;

public class j1_RunTimeDemo {
    public static void main(String[] args) {
        // 每个Java应用程序都有一个类Runtime实例，它允许应用程序与运行应用程序的环境进行交互。可以从getRuntime方法获得当前运行时。
        Runtime r1 = Runtime.getRuntime();
        Runtime r2 = Runtime.getRuntime();
        System.out.println(r1 == r2);  // true -- 这是单例模式的体现

        // 补充Runtime类的成员方法
        try {
            r1.exec("calc");
            r1.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
