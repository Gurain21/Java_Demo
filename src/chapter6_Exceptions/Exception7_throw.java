package chapter6_Exceptions;
/*利用throw语句可以明确地抛出一个异常。格式如下为： throw<exception>;
其中，Exception是Throwable类或其子类，而且不能为多个
 */
public class Exception7_throw {
     public static void main(String[] args) {
        try {
            throwException();//监控方法
        }catch (NullPointerException e){
            System.out.println("捕获方法throwException()中的异常NullPointerExcepiton");
        }
    }
    private static void throwException(){
        try {
            String s = null;
            if (s == null){
                //s为null事抛出 NullPointerException异常
                throw new NullPointerException();
            }
        }catch (NullPointerException e){
            System.out.println("方法throwException()中抛出一个NullPointerException异常");
            throw e; //抛出异常e
        }
    }
}
