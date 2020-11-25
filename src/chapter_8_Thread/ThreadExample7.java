package chapter_8_Thread;

/**
 * 多线程同步机制：同步方法的使用；synchronize
 * 当多线程涉及到使用公共资源时，可能会出现临界资源安全问题
 * 此时，我们需要使用synchronize修饰符给方法添加同步机制
 * 当线程A执行这个同步方法时，试图调用该同步方法的其它线程都必须等待当前线程A退出该同步方法。
 * 本例展示的就是临界资源安全问题，下一例展示synchronize关键字
 */
public class ThreadExample7 {
    public static void main(String[] args) {
        MyThread7 t = new MyThread7();
        Thread t1=  new Thread(t);
        Thread t2=  new Thread(t);
        t1.start();
        t2.start();
    }
}
class MyThread7 implements Runnable{
    private int count =0;//定义共享变量count

    @Override
    public void run() {
        test();
    }
    void  test(){
        for (int i = 0;i <5;i++){
            count++;
            Thread.yield();//线程让步
            count--;
            System.out.print(count+" " );//输出count的值
        }
    }
}