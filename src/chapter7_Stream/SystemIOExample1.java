package chapter7_Stream;//System.in.read()读取键盘输入数据
/**
 * 系统遇到read方法后将阻塞,遇到换行时才逐个读入字符
 * 由于read()方法是逐个读取字符的,因此,它无法识别用户输入的整数,浮点数,字符串等...
 * 由于read()方法是按字节读取字符的,因此它只能读取单字节的字符(如英文,数字,和英文标点符号等)而无法读取双字节的汉字
 *
 *
 */

import java.io.IOException;

public class SystemIOExample1 {
    public static void main(String[] args) throws IOException {
        int b ;
        System.out.println("请输入数据:");
        //循环读取键盘输入,遇到 N 循环停止
        while ((char)(b=System.in.read()) != 'N'){
            System.out.print((char)b);
        }
    }
}
