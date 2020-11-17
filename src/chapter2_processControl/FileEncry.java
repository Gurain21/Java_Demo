package chapter2_processControl;

import java.util.Scanner;
/*
通过 for循环遍历每一个字符  再用我们定义的密钥来与遍历得到的值一个个 进行按位异或^运算  加密一个字符数组
 */
public class FileEncry {
    public static void main(String[] args) {
//提示用户输入加密的内容：
        System.out.println("请输入加密的内容： ");
        Scanner scan1In = new Scanner(System.in);//secret ：秘密的，不公开的。
        String secretStr = scan1In.nextLine();//返回键盘输入的一行字符串
        char[] secretChars = secretStr.toCharArray();//通过toCharArray方法将字符串转换为字符数组
        char secret = 'x'; //字符变量用于保存加密密钥
        //加密运算的思路： 将要加密的字符与字符 x 进行按位异或运算  ，得到密文。
        System.out.println("密文：");
        for (int i = 0;i<secretChars.length;i++){
            secretChars[i] = (char)(secretChars[i]^secret);
            System.out.print(secretChars[i]);//打印密文
        }
        System.out.println("明文： ");
        //解密运算： 加密后的字符再与 字符 x 按位异或可以取得原文
        for (int i = 0;i<secretChars.length;i++){
            secretChars[i] = (char)(secretChars[i]^secret);
            System.out.print(secretChars[i]);//打印明文
        }
    }
}
