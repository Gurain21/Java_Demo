package Chapter6_异常处理;//excetpion2 。java
/*
 public static void main(String[] args) throws FileNotFoundException, IOException{
main方法名后面的throws声明的意思是抛出异常，其后为要抛出的异常列表

throws声明的意思是： 对于本方法出现的异常将不在本方法中处理，而是将其交由调用本方法的对象处理（逐级回溯）。
    如果对象也不处理，则程序终止。否则，处理后程序将正常运行。


    就本例而言，由于main方法已经是最上层，故无异常上交，因此，程序在出现异常时将自动终止。
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//非运行时异常
/*
编写一个程序、按字节方式读取文件并显示文件的内容
 */
public class Exception1 {
    public static void main(String[] args)
        throws FileNotFoundException, IOException //使用throws抛出异常
    {
            //创建FileInputStream对象
            FileInputStream fis = new FileInputStream("text.txt");
            //Exception in thread "main" java.io.FileNotFoundException: text.txt (系统找不到指定的文件。)
            int b;
            while ((b = fis.read()) != -1) { //读取文件字节数据有效时 循环
                System.out.println(b);//输出读出的字节数据
            }
            fis.close();//关闭文件
        }
    }

