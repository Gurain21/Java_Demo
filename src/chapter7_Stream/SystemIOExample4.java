package chapter7_Stream;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// TODO: 2020/11/21 从命令行中读入字符串，并处理和显示
public class SystemIOExample4 {
    public static void main(String[] args) throws IOException {
        // TODO: 2020/11/21 使用System.i构造一个InputStreamReader对象 用于从键盘中读取一个单字节字符
        InputStreamReader isr = new InputStreamReader(System.in);
        // TODO: 2020/11/21 利用isr对象构造一个BufferedReader对象
        BufferedReader br = new BufferedReader(isr);
        System.out.println("请输入一个字符串：");
        // TODO: 2020/11/21 将缓冲区中从键盘中读取到的那一行字符串打印出来
        System.out.println(br.readLine());
        // TODO: 2020/11/21 立一个falg 用于表示数据是否符合我们的格式
        boolean falg = false;
        do {
            try {
                System.out.println("请输入一个浮点数：");
                // TODO: 2020/11/21 当键盘输入的不是浮点数时，此时会出现异常
                double numBySystem = Double.parseDouble(br.readLine());
                System.out.println(numBySystem);
                falg = false;
            }catch (NumberFormatException e){
                System.out.println("数据无效，请重新输入：");
                falg = true;
            }
        }while (falg);
        System.out.println("程序结束！");
    }
}
