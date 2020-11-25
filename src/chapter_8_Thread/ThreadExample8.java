package chapter_8_Thread;

/**
 * 当被synchronize修饰的方法执行完或者发生异常时，会自动释放所加的锁；
 */
public class ThreadExample8 {
    public static void main(String[] args) {
        MyThread8 t= new MyThread8();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();
    }
}
class MyThread8 implements Runnable{
    private int count =0;
    @Override
    public void run() {
        test();
    }
   private  synchronized void  test(){//synchronize修饰

        for (int i = 0;i<5;i++){
            count++;
            Thread.yield();//线程让步
            count--;
            System.out.print(i+" ");//输出count的值
        }
    }
}