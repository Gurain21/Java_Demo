package chapter2_processControl;
/*
分支语句 if else 的使用及注意点
 */
import java.util.Scanner;

//if（expression）{
// statement
//} else{
//}
//          if(expression)
//              statement
//         else if(expression)
//                statement
//          else if(expression)
//    else总是与离它最近的if或者else if配对，可以通过大括号来改变配对关系。本例中的if else 是一个典型的if else 语法案例


public class ComputeTax {
    public static void main(String[] args) {
        double income = 0.0;
        int status = 0;
        double tax = 0;
        System.out.println("请输入纳税人的类型：0-单身，1-已婚，2-家庭");
        Scanner scanStatus = new Scanner(System.in);

        if (scanStatus.hasNextInt()) {//hasNextInt方法用于判断扫描器输入的内容是否可以解释为int型数据
            status = scanStatus.nextInt();//输入纳税人的类型
        }

        System.out.println("请输入可征收类型（您的月工资收入）");
        Scanner scanCome = new Scanner(System.in);
        if (scanCome.hasNextDouble()) {
            income = scanCome.nextDouble();
        }
        if (status == 0) {
            if (income <= 6000) {
                tax = income * 0.10;
            } else if (income <= 27950) {
                tax = 6000 * 0.10 + (income - 6000) * 0.15;
            } else if (income <= 67700) {
                tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (income - 27950) * 0.27;
            } else if (income <= 141250) {
                tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (income - 67700) * 0.30;
            } else {
                tax = 6000 * 0.10 + (27950 - 6000) * 0.15 + (67700 - 27950) * 0.27 + (141250 - 67700) * 0.30 + (income - 141250) * 0.35;
            }
        } else if (status == 1) {
            if (income <= 12000)
                tax = income * 0.10;
            else if (income <= 46700)
                tax = 12000 * 0.10 + (income - 12000) * 0.15;
            else if (income <= 112850)
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (income - 46700) * 0.27;
            else if (income < 171950)
                tax = 12000 * 0.10 + (46700 - 12000) * 0.15 + (171950 - 46700) * 0.27 + (income - 112850) * 0.30;
            else
                tax = 2000 * 0.10 + (46700 - 12000) * 0.15 + (112850 - 46700) * 0.27
                        + (171950 - 112850) * 0.30 + (income - 171950) * 0.35;
        } else if (status == 2) {
            // .....
        }
        System.out.println("纳税人需要缴纳的税额为：" + tax + "￥");
    }
}
