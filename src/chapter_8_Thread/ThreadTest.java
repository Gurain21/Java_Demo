package chapter_8_Thread;

/**
 * 利用多线程模拟左右手轮流写字。
 */
public class ThreadTest {
    public static void main(String[] args) {
        LeftHand leftHand = new LeftHand();
        RightHand rightHand = new RightHand();
        leftHand.start();
        rightHand.start();
    }
}
//左手线程
class LeftHand extends  Thread{
    @Override
    public void run() {
        for (int i= 0;i<5;i++){
            System.out.print("A");
            try {
                sleep(500);//leftHand线程休眠500毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
//右手线程
class RightHand extends  Thread{
    @Override
    public void run() {
        for (int i= 0;i<5;i++){
            System.out.print("B");
            try {
                sleep(300);//RightHand线程休眠500毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    }
