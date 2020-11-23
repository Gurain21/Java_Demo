package chapter_8_Thread;

/**
 * 实现Runnable 接口，基于此类创建对象，然后再讲该对象作为Thread类构造方法的参数，创建Thread对象
 * 最后通过Thread类对象调用start方法启动线程
 */
public class ThreadExample2 {
    public static void main(String[] args) {
        MyThread2 mt = new MyThread2();
        Thread  t = new Thread(mt);
        t.start();
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i= 0;i<10;i++){
            System.out.println(i);
        }
    }
}