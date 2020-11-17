package chapter6_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*使用try—catch语句捕获异常并处理
    将可能出现异常的语句放在try代码块中，而将各种异常处理代码按类型放在多个catch代码块中
 */
public class Exception3 {
    public static void main(String[] args) {

      try { //    try代码块，其中可能会出现异常
          FileInputStream fis = new FileInputStream("text.txt");
          int b ;
          while ((b=fis.read())!= -1){
              System.out.println(b);
          }
          fis.close();
      } catch (FileNotFoundException e) {
          //利用catch语句捕捉FileNotFoundException异常并处理
          //FileNotFoundException为异常类型，e为异常对象
          System.out.println(e);
          System.out.println("message(异常提示)：" + e.getMessage());
      }catch (IOException e){
          //利用catch语句捕捉IOException异常并处理
          System.out.println(e);
      }
        System.out.println("程序正常结束！");


    }}
