package demo23_Lambda.j3_Lambda_Notes;

public class j1_LambdaNotes {
    public static void main(String[] args) {
        // 2.必须有上下文环境，才能推导出Lambda对应的接口--意思就是不能单独写Lambda表达式，它本身没有意义，
        // 把Lambda表达式传给别人才有意义，才能发挥作用
        Runnable r = ()-> System.out.println("一个线程开启了");
        new Thread(r).start();

        // 进一步简化
        new Thread(()->System.out.println("一个线程开启了")).start();
    }
}
