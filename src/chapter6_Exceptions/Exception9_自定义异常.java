package chapter6_Exceptions;


/*
Java的类库中定义了许多异常类，它们主要用来处理程序中一些常见的运行错误，这些错误是系统可以预见的。
如果我们开发程序时有一种错误是系统未预见的，是我们自己程序中特殊的异常，这时我们需要自己创建自定义异常类
使系统可以识别这种错误并进行处理。

怎么自定义创建异常类呢？ 通过继承Exception类来自定义异常。
class <自定义异常类名>extends Exception{}
 */
class MyExcetption extends Exception{
    MyExcetption(String s){//构造方法
        super(s);
    }
}
public class Exception9_自定义异常 {
    //声明抛出MyException异常
     static void method(int level)throws MyExcetption {
        System.out.println("调用方法 method ("+level+")");
        if (level> 10 ){
            throw new MyExcetption("水位过高");
        }
         System.out.println("水位无异常");
    }

    public static void main(String[] args) {
        try {
            method(1);
            method(12);
        }catch (MyExcetption e){
            System.out.println("捕捉自定义异常"+e);
        }
    }
}
