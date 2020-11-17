package chapter2_processControl;
import java.util.Scanner;
/*
    键盘输入两个数值、把这两个数值赋值给x、y 然后在控制台输出x、y和
 */
public class Example2_1{
    public static void main(String[] args) {
        int x,y,z;
        System.out.println("请输入两个整数：");
//        Scanner in =Scanner(System.in);
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        z = x +y;
        System.out.println(x + "+"+y+"="+z);

    }
}