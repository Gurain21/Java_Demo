package chapter2_processControl;

/*
switch分支语句的使用：
default：默认分支，当所有分支都不匹配时默认走这一分支
case 分支一
break：防止贯穿 ；falltrough
 */
import java.util.Scanner;

public class ShowDays {
    public static void main(String[] args) {
        System.out.println("请输入年份");
        Scanner inYear = new Scanner(System.in);
        int year = inYear.nextInt();
        System.out.println("请输入月份");
        Scanner inMouth = new Scanner(System.in);
        int mouth = inMouth.nextInt();
        int numDays = 0;
        switch (mouth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if ((year % 4 == 0) && !(year % 100 == 0) || (year % 400 == 0)) {//润年
                    numDays = 29;
                } else {
                    numDays = 28;
                }
                break;
        }
        System.out.println(year + "年" + mouth + "月份有" + numDays+"天");

    }
}
