package Chapter6_异常处理;

/*
多重catch语句示例：
一段代码块可能引发多个异常，处理这种情况就需要用到多重catch语句每个catch捕获一种异常类型
当异常发生时，每一个catch依次被检查，第一个匹配异常类型的catch 的代码块被执行，当一个catch执行后，其它的catch将被忽略
程序将从try\catch代码块后面的语句继续执行。

 */
public class Exception5 {
    public static void main(String[] args) {
        try {
            int i = args.length;//args为main方法数组参数的长度
            System.out.println("i = " + i);
            int j = 5 / i;//除数为0；
            int[] k = {1, 2, 3};
            k[3] = 5;//数组下标越界
        } catch (ArithmeticException e) {
            System.out.println("除数不能为零：" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组下标越界" + e);
        }
        System.out.println("执行catch语句后的代码块！");
    }
}
