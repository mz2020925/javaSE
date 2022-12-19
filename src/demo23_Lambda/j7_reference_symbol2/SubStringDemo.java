package demo23_Lambda.j7_reference_symbol2;

public class SubStringDemo {
    public static void main(String[] args) {
        // Lambda表达式 -- 写了实现接口的类、重写了接口的唯一抽象方法subString、创建了实例化类的对象，最后将该对象以多态形式传给方法的形参sub
        useSubStringInter((s, x, y) -> {
            String res = s.substring(x, y);
            return res;
        }, "helloworld", 0, 9);

        // Lambda表达式化简
        useSubStringInter((s, x, y) -> s.substring(x, y), "helloworld", 0, 9);

        // 3.引用对象的实例方法，类::成员方法
        useSubStringInter(String::substring, "helloworld", 0, 9);


    }

    private static void useSubStringInter(SubStringInter sub, String s, int x, int y) {
        String res = sub.subString(s, x, y);
        System.out.println(res);
    }
}
