package demo15_T;

public class j3_method_T<T> {  // 泛型成员变量和成员方法（泛型参数）必须定义在泛型类中，也就是要写成public class j3_method_T<T>
    // 方法1，这不是泛型方法哦
    public void printT(T t) {
        System.out.println(t);
    }

    public static void main(String[] args) {
        /* 方法1 */
        // 1.第一种方式更加简单 -- 方法1
        j3_method_T<Object> j3Obj = new j3_method_T<>();
        j3Obj.printT("zmz");
        j3Obj.printT(100);
        j3Obj.printT(true);
        j3Obj.printT(3.1415);

        // 2.第二种方式可以将异常提前，即提前规定泛型的具体类型，避免后面传入其他类型 -- 方法1
        j3_method_T<String> j3Obj2 = new j3_method_T<>();
        j3Obj2.printT("zmz");

        j3_method_T<Integer> j3Obj3 = new j3_method_T<>();
        j3Obj3.printT(100);

        j3_method_T<Boolean> j3Obj4 = new j3_method_T<>();
        j3Obj4.printT(false);

        j3_method_T<Double> j3Obj5 = new j3_method_T<>();
        j3Obj5.printT(3.1415);


        /* 方法2 */
    }
}
