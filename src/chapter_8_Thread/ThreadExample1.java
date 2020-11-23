package chapter_8_Thread;

/**
 * 继承java.lang.Thread类,覆盖其run方法创建线程类.并在main函数中通过start方法启动线程.
 * 一个线程只能运行一次.不然会出现下面的异常：
 * Exception in thread "main" java.lang.IllegalThreadStateException
 *
 */
public class ThreadExample1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        MyThread t2 = new MyThread();
        t.start();
//        t.start();
        t2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i  = 0;i<10;i++){
            System.out.println(i+" ");
        }
    }
}