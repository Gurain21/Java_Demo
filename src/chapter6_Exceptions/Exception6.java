package chapter6_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
利用try catch代码块来检查用户输入的数据是否是有效的浮点数，如果是，则将其记录，否则提示用户重新输入。
技术要点：Scanner nextDouble inputMismatchException  、、Mismatch：不匹配
 */
public class Exception6 {
    public static void main(String[] args) {
        //创建一个scanner对象
        Scanner in = new Scanner(System.in);
        //设置控制变量dataright并赋值
        boolean dataright =false;
        //循环控制
        do{
            try {
                System.out.println("请输入一个浮点数：");
                double numberx = in.nextDouble();
                System.out.println(numberx);
                dataright =false;
            }catch (InputMismatchException e){
                System.out.println("数据无效，请重新输入：");
                //修改循环变量，使之有效，继续循环
                dataright =true;
                //读取数据换行
                in.nextLine();
            }
        }while (dataright);
    }

}

