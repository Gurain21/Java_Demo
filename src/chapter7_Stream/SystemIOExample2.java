package chapter7_Stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 该例演示字节缓冲输入流的是哦也能够方法,在执行本例前,先打开一个windows的记事本程序
 * 创建一个txt文件在里面写入一句话,并记下该文件路径
 */
public class SystemIOExample2 {
    public static void main(String[] args)throws IOException {
        //定义一个文件输入流对象,其内容源自txt文件
        FileInputStream fis = new FileInputStream("E:\\Code\\Java\\javaDemo\\src\\chapter7_Stream\\test.txt");//name = 文件路径
        //定义一个缓冲输入流对象,其内容源自文件输入流对象
        BufferedInputStream buffIn = new BufferedInputStream(fis);
        //定义一个缓冲输入流对象,其内容源自键盘输入
        BufferedInputStream keyIn = new BufferedInputStream(System.in);
        //定义两个字节数组
        byte[] b1=new byte[1024],b2 = new byte[1024];
        //将从文件读取到的数据放入b1, num1为读入的字节个数
        int num1 = buffIn.read(b1);
        //将字节数组转换成字符串
        String str1 = new String(b1,0,num1);
        System.out.println(str1);
        //关闭缓冲输入流,同时关闭了文件
        buffIn.close();
        //将从键盘读取的数据放入字节数组b2中,num2 为读入的字节个数
        int num2 = keyIn.read(b2);
        String str2 = new String(b2,0,num2);
        System.out.println(str2);


    }
}
