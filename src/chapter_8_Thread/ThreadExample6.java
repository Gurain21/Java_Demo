package chapter_8_Thread;

/**
 * 对于正在执行的线程，可以调用join方法等待其执行结束，然后才执行其他线程。
 * join方法有几种重载形式，具体参考java API
 * 另外，join方法可能会出现非运行时异常：InterruptedException
 */
public class ThreadExample6 {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 t1 = new MyThread6();
        MyThread6 t2 = new MyThread6();
        t1.start();
        t1.join();//等待t1 执行结束才会开始执行t2
        t2.start();
    }
}

class MyThread6 extends Thread{
    @Override
    public void run() {
    for (int i = 0;i<10;i++){
        System.out.print(i);
    }
    }
}