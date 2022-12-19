package demo24_Function_Interface.j4_function_interface_Consumer;

import java.util.function.Consumer;

public class getInfoDemo {
    public static void main(String[] args) {
        // 1.基本Lambda表达式
        String[] strArray = {"林青霞,30", "张曼玉,35", "王祖贤,33"};
        printInfo(strArray, (String s) -> {
            String name = s.split(",")[0];
            System.out.print("姓名：" + name);
        }, (String s) -> {
            int age = Integer.parseInt(s.split(",")[1]);
            System.out.println(",年龄：" + age);
        });

        // 2.化简版Lambda表达式
        String[] strArray2 = {"林青,0", "张玉,5", "王贤,3"};
        printInfo(strArray2, s -> System.out.print("姓名：" + s.split(",")[0]),
                s -> System.out.println(",年龄：" + Integer.parseInt(s.split(",")[1])));
    }

    private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String s : strArray) {
            /*
             * 把打印姓名作为第一个Consumer接口的Lambda实例的功能
             * 把打印年龄作为第二个Consumer接口的Lambda实例的功能
             * */
            con1.andThen(con2).accept(s);
        }
    }
}
