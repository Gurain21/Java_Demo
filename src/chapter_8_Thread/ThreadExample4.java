package chapter_8_Thread;

/**
 * 对于正在运行的线程，调用sleep方法使其放弃CPU资源进入休眠，此线程转为阻塞状态
 */
public class ThreadExample4 {
    public static void main(String[] args) {
        MyThread4 t = new MyThread4();
        t.start();
    }
}

class MyThread4 extends  Thread{
    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println(i+ " ");
            try {
                sleep(1000);//线程休眠1000毫秒，即每隔一秒打印一个数字。sleep可能会出现异常，抓一下
            }catch (InterruptedException e ){
                System.out.println(e.getMessage());
            }
        }
    }
}
