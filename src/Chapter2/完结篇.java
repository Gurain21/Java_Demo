package Chapter2;

import java.util.Scanner;

public class 完结篇 {
    /*
    JAVA语言的基本数据类型：
    整型： byte short int long
    浮点：float double
    字符：char
    布尔 boolean  false true

    JAVA的复合数据类型：
     interface
     class
     array

     变量：在程序运行过程中可以被改变的量
     常量：在程序运行过程中不能被改变的量


     在不同数据类型的运算过程中会用到强制类型转换


     break：防止switch穿透  当case匹配成功后。执行case的代码块遇到了break 才不会直接穿透
     continue： 跳过本次循环，进行下一次循环；
     break： 彻底结束循环。

     */

    public static void main(String[] args) {
        //上机题：1
       /* int a,b,c ;
        System.out.println("请依次输入三条边的长度 (cm) ");
        Scanner in =new Scanner(System.in);
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        if ((a+b>c)||(a+c>b)||(b+c>a)){
            System.out.println("输入有效，这三条边可以组成一个三角形");
        }else{
            System.out.println("长度为"+a+""+b+""+c+"三条边不能组成三角形");
        }*/
//2 一个卖花女卖鲜花，，晴天每天可卖20朵，雨天可卖12朵，
// 有一段时间连续几天共卖出了112朵鲜花，平均每天卖14朵，请编程推算这几天内有几个晴天？几个雨天？
     /*   int sun = 20;
        int rain = 12;
        int sun_day = 0,rain_day =0;
        int days = 112 / 14;
       for (int i = 1;i<days;i++){
          if (i*sun +(days-i)*rain == 112){
              sun_day = i;
              rain_day =days-i;
              System.out.println("晴天："+sun_day);
              System.out.println("雨天："+rain_day);
          }
       }*/
        //3.假如今年某大学的学费为400元，学费的增长率为5%。
        // 使用循环语句编写程序。分别计算10年后的学费以及从现在开始的四年的总学费
        int cost = 400;
        int total = 400;
        for (int count = 0;count<10;count++){
            cost+= cost*0.05;
            total+=cost;
            if (count ==3){
                System.out.println(count+1+"年总计"+total);
            }
            if (count==9){
                System.out.println(count+1+"年总计"+total);

            }
        }
//        do {
//            if (count == 0) {
//                total += cost;//400
//                System.out.println("今年的学费是" + cost);
//                System.out.println("总学费" + total);
//
//            }
//            cost += cost * 0.05;//420
//            total += cost;//400
//
//            count++;//1
//
//            System.out.println(count + "年后的学费为" + cost);//
//            System.out.println("总学费" + total);
//            if (count == 4) {
//                System.out.println(total);
//            }
//            if (count == 10) {
//                System.out.println(total);
//
//            }
//
//        } while (count < 10);
//    }
}}
//class triangle{
//    private  int A;
//    private  int B;
//    private  int C;
//
//    public void setA(int a) {
//        A = a;
//    }
//
//    public void setB(int b) {
//        B = b;
//    }
//
//    public void setC(int c) {
//        C = c;
//    }
//
//    public int getA() {
//        return A;
//    }
//
//    public int getB() {
//        return B;
//    }
//
//    public int getC() {
//        return C;
//    }
//
//    //
////    Scanner in2 = new Scanner(System.in);
////    Scanner in3 = new Scanner(System.in);
//    public void  isTr(int a,int b,int c){
//
//    }
//}