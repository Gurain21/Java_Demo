package chapter6_Exceptions;
/*
thorws 对于非运行时异常，如果程序中没有进行捕获，则必须在方法声明时使用thrwos声明进行抛出，否则可能会导致编译错误
throws声明格式为:
 返回类型 方法名 (<参数列表>) throws 异常列表{
        //方法体
}
其中，异常列表是throwable类中的子类，多个异常类之间使用逗号分隔。
 */
public class Exception8_throws {
    private static  void  throwException()throws IllegalAccessException{
        throw new IllegalAccessException("非法访问异常");
    }

    public static void main(String[] args) {
        try {
            throwException();
        }catch (IllegalAccessException e){
            System.out.println("捕获"+e);
        }
        System.out.println("程序正常结束！");
    }
}
