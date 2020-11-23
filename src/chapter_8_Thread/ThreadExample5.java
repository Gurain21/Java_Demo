package chapter_8_Thread;

/**
 * 对于正在运行的线程，可以调用yield方法使其重新再就绪队列排队，并将CPU资源让给排在队列后面的线程
 * 此时线程转为就绪状态
 * yield方法只让步给高优先级或同等优先级的线程，如果就绪队列后面的是低优先线程，则继续执行此线程。
 * yield方法没有参数，也不会出现异常。
 */
public class ThreadExample5 {
    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        MyThread5 t2 = new MyThread5();
        t1.start();
        t2.start();
    }
}
class MyThread5 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.print(i );
            yield();//线程让步
        }
    }
}