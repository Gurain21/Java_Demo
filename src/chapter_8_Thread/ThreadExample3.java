package chapter_8_Thread;

/**
 * 线程是有优先级的，在多线程程序中，往往是优先级高的线程先执行。优先级相同时，则遵循队列的先进先出原则
 * 可以通过Thread.setPriority()方法来设置线程的优先级，最低为1，最高优先级为10；默认为5
 */
public class ThreadExample3 {
    public static void main(String[] args) {
      MyThread3  t1 = new MyThread3();
      MyThread3  t2 = new MyThread3();
      t1.setPriority(1);
      t2.setPriority(10);
      t1.start();
      t2.start();
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            System.out.println(i +" "+getName()+"优先级是："+getPriority());
        }
    }
}