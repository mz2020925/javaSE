package demo21_Threads.j1_more_threads;

/*
两个小问题
    为什么要重写run()方法？
    因为run()是用来包含被我创建的这个线程类(继承于Thread类)执行的代码(方法)，就是我创建一个线程类(就是一个线程，java中都是类<->对象)
    就是我想让这个线程干啥，就写在这个类中
run()方法和start()方法的区别？
    run()：封装线程执行的代码，直接调用，相当于普通方法的调用
    start()：启动线程；然后由JVM调用此线程的run()方法
* */
public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

