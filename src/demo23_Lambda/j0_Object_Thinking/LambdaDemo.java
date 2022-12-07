package demo23_Lambda.j0_Object_Thinking;

public class LambdaDemo {
    public static void main(String[] args) {
        // 1.面向对象的思想
        MyRunnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        // 2.简化一下，使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用面向对象的思想，启动多线程了");
            }
        }).start();

        // 3.Lambda表达式
        new Thread(() -> {
            System.out.println("使用面向对象的思想，启动多线程了");
        }).start();




    }
}
