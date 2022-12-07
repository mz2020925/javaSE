package demo13_Set_HashSet;

public class j2_hashCode {
    public static void main(String[] args) {
        j2_hashCode hc = new j2_hashCode();
        j2_hashCode hc2 = new j2_hashCode();

        // 不同对象的hashCode()是不同的，但如果重写了它的hashCode()方法的话，就是一样的
        System.out.println(hc.hashCode());
        System.out.println(hc2.hashCode());

        // 不同字符串
        System.out.println("java".hashCode());
        System.out.println("python".hashCode());

        System.out.println("重载".hashCode());
        System.out.println("多态".hashCode());
    }
}
