package chapter7_Stream;

import java.util.Scanner;

/** TODO: 2020/11/21 利用Scanner类的nextFloat()方法读取浮点数，利用hasNextFloat()方法判断是否结束数据读取。
 * TODO:如果当前读取的数据不是浮点数，则hashNextFloat()返回false，程序结束。
*/
public class SystemIOExample5 {
    public static void main(String[] args) {
        float numberx = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("卧槽");
        while (in.hasNextFloat()){
            numberx = in.nextFloat();
            System.out.println(numberx+" ");
        }
    }
}
