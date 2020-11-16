package Chapter6_异常处理;
/*
如果try代码块中指定的代码没有抛出异常、那么
try代码块执行结束后，会跳过一个或多个catch语句，
程序会从最后一个catch语句后面的第一个语句继续执行。
因此，catch语句只有在抛出异常的时候才会执行。

如果try代码块中指定的代码引发了异常，程序控制由try代码转到catch块，执行完catch语句后，程序将从try/catch代码块下面
的语句继续执行，并不会从catch语句返回到try代码块中。
 */
public class Exception4 {
    public static void main(String[] args) {
        int a = 0;
        try {
            System.out.println(5/a);
        }catch (ArithmeticException e){
            System.out.println("除数不能为零！");
        }
        System.out.println("程序正常结束！");
    }
}
