package chapter6_Exceptions;
/*
finally语句用来为异常处理提供一个统一的出口。通常，finally语句主要用于资源清理工作，如关闭打开的文件、断开网络连接等。。。
不论在try代码块中是否发生了异常，finally代码块中的语句都会被执行。

注意点：finally语句需要与try、catch语句配合使用，并且在try、catch语句之后
不论try语句中的代码块如何执行，finally中的语句总要执行一次。
finally不是必须的，如果没有finally语句，程序在执行完try、catch语句后，直接跳到之后的语句继续执行。
 */
public class Exception6_2finally {
    public static void main(String[] args) {
        try {
            int a[] = new  int[4];
            a[4] = 39; //数组下标越界；
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }finally {
            System.out.println("finally中的代码块总被执行！");
        }
        System.out.println("程序正常终止！");
    }
}
