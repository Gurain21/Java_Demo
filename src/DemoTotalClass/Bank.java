package DemoTotalClass;

import java.awt.*;
import java.util.Objects;
import java.util.Scanner;

/* 银行类 */
public class Bank {
    public Bank() {
        initial();
    }

    //保存用户的数组
    private User[] users = new User[5];
    private int size;//保存个数

    //第一个功能  初始化
    public void initial() {
        User user1 = new User();
        user1.setCardNo("6222299988880000");
        user1.setIdentity("14524279835986");
        user1.setUsername("二狗");
        user1.setPassword("123456");
        user1.setPhone("1946882756926");
        user1.setBanlance(10000);
        User user2 = new User("622222298918", "129479187249", "大狗", "123456", "123415", 20000);

        users[0] = user1;
        users[1] = user2;
        size = 2;
        System.out.println("用户初始化完成!");
    }

    //用户登录功能
    public void login() {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入卡号");
        String cardNo = in.next();
        System.out.println("请输入密码");
        String password = in.next();
        User u = null;
        //遍历数组
        for (int i = 0; i < size; i++) {
            if (users[i].getCardNo().equals(cardNo) && users[i].getPassword().equals(password)) {
                u = users[i];
                break;
            }
        }
        if (u != null) {
            System.out.println("登录成功!");
            showMenu(u);

        } else {
            System.out.println("登录失败!");

        }
    }

    //显示菜单
    public void showMenu(User u) {
        Scanner in = new Scanner(System.in);
        System.out.println("欢迎进入用户账号为:" + u.getCardNo() + "XXXXXX银行系统XXXXXXXX");

        do {
            System.out.println("====1.存款 2.取款 3.转账 4.查询余额 5.修改密码 0.退出");
            int chose = in.nextInt();
            switch (chose) {
                case 1:
                    this.save(u);
                    break;
                case 2:
                    this.withDraw(u);
                    break;
                case 3:
                    this.trans(u);
                    break;
                case 4:
                    this.query(u);
                    break;
                case 5:
                    this.setPassword(u);
                    break;
                default:
                    login();
                    break;

            }
        } while (true);
    }

    public void save(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入存款金额");
        double m = input.nextDouble();
        if (m > 0) {
            u.setBanlance(u.getBanlance() + m);
            System.out.println("存钱成功,当前余额:" + u.getBanlance());
            return;
        } else {
            System.out.println("存钱失败,请重试...");
            return;
        }
    }

    public void withDraw(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入取款金额");
        double m = input.nextDouble();
        if (m > 0) {
            if (u.getBanlance() - m >= 0) {
                u.setBanlance(u.getBanlance() - m);
                System.out.println("取钱成功,当前余额:" + u.getBanlance());

            } else System.out.println("存钱失败,请重试...");

        } else {
            System.out.println("存钱失败,请重试...");
        }
    }

    public void trans(User u) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入对方卡号");
        String cardNo = input.next();
        System.out.println("请输入转账金额");
        double m = input.nextDouble();
       //判断对方账号是否存在
        User toUser = null;
        for (int i = 0;i<size;i++){
            if (users[i].getCardNo().equals(cardNo)){
                toUser =users[i];
                break;
            }
        }
        if (toUser != null){
            if (u.getBanlance()> m){
                u.setBanlance(u.getBanlance() -m);
                toUser.setBanlance(toUser.getBanlance()+m);
                System.out.println("转账成功");
            }else {
                System.out.println("转账失败,余额不足");
            }
        }else {
            System.out.println("代码账号不存在");
        }
        }


    public void query(User u) {
        System.out.println("当前余额为:" + u.getBanlance());
    }

    public void setPassword(User u) {
        System.out.println("请输入旧密码");
        Scanner input = new Scanner(System.in);
        String pwd = input.next();
        if (u.getPassword() != pwd) {
            System.out.println("密码错误 ...");
            return;
        } else {
            System.out.println("请输入新密码");
            String topwd = input.next();
            u.setPassword(topwd);
            System.out.println("密码更换成功,请重新登录!");
            login();
        }
    }
}
