package demo21_Threads.j1_more_threads;

/*
    1.定义一个类MyThread继承Thread类
    2.在MyThread类中重写run()方法
    3.创建MyThread类的对象
    4.启动线程
* */
public class MyThreadDemo {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        // 这种方式是不能实现双线程同步的
//        myThread1.run();
//        myThread2.run();

        // run()：封装线程执行的代码，直接调用，相当于普通方法的调用
        // start()：启动线程；然后由JVM调用此线程的run()方法
        myThread1.start();
        myThread2.start();
    }
}
