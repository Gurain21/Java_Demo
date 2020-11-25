package chapter_8_Thread;

public class TicketSeller implements Runnable {
    public static void main(String[] args) {
        TicketSeller t = new TicketSeller();
        MrLi = new Thread(t);
        MrZhang = new Thread(t);
        MissWang = new TicketSeller0();
        MrZhang.start();//启动张先生的线程
        MrLi.start();//启动李先生的线程
    }

    static Thread MrZhang, MrLi;
    static TicketSeller0 MissWang;

    @Override
    public void run() {
        if (Thread.currentThread() == MrZhang) {
            MissWang.sellRegulate(20);//调用买票的方法
        } else if (Thread.currentThread() == MrLi) {
            MissWang.sellRegulate(5);
        }
    }
}

class TicketSeller0 {
    int sumFive = 2, sumTwenty = 0;//定义5元和2元的个数

    public synchronized void sellRegulate(int money) {
        if (money == 5) {
            System.out.println("李先生，您的钱数正好");
        } else if (money == 20) {
            while (sumFive < 3) {
                try {
                    wait();//如果五元的个数小于3张，则线程等待。
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                sumFive = sumFive - 3;
                sumTwenty = sumTwenty + 1;
                System.out.println("张先生，您给我20元，找您15元");
            }
        }
        notifyAll();//通知等待的线程
    }

}