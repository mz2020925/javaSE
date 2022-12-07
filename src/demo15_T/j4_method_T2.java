package demo15_T;

public class j4_method_T2 {
    // 方法2，这才是泛型方法哦 -- 这样就可以不把类定义成泛型类了
    public <T> void printT(T t){
        System.out.println(t);
    }

    public static void main(String[] args) {
        j4_method_T2 j4T2 = new j4_method_T2();
        j4T2.printT("zmz");
        j4T2.printT(100);
        j4T2.printT(3.14);
        j4T2.printT(true);

    }
}
