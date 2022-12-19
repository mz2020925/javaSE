package demo24_Function_Interface.j2_as_formal_parameter_and_return;

/*
* 函数式接口作为方法的形参（换句话说，方法的形参式函数式接口类型）—— 此时方法形参可以用Lambda表达式来传给它
* */
public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        // Lambda表达式实现给方法的形参（函数式接口）传递值（接口的实现类然后创建类的实例化对象）
        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }

    // 1.函数式接口Runnable r 作为方法的参数
    private static void startThread(Runnable r) {
        // Thread t = new Thread(r);
        // t.start();
        new Thread(r).start();
    }
}
