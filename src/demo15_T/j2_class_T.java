package demo15_T;

public class j2_class_T<T> {  // 带泛型参数的类 -- 泛型类
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }


    // 可以直接在本类（泛型类--成员变量的类型是泛型）中写main函数并创建本类对象
    public static void main(String[] args) {
        j2_class_T<String> j2classStr = new j2_class_T<>();
        j2classStr.setT("zmz");
        System.out.println(j2classStr.getT());


        j2_class_T<Integer> j2classInt = new j2_class_T<>();
        j2classInt.setT(1000);
        System.out.println(j2classInt.getT());
    }
}
