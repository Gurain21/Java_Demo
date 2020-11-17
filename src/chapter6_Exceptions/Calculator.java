package chapter6_Exceptions;
/*
错误: 找不到或无法加载主类 Chapter6.Calculator
当在dos命令行给main函数传递参数时，发生了 ： 错误: 找不到或无法加载主类 Chapter6.Calculator
先编译成class文件：javac -encoding UTF-8 Calculator.java
第一种方式：在src目录下使用命令 java 全类名 参数1 参数2 参数3 ...
E:\Code\Java\javaDemo\src>java Chapter6.Calculator 1 x 3
第二种方式：把源文件中的package那行代码注释掉，再次编译class文件：javac -encoding UTF-8 Calculator.java
    在该文件的上一级目录中使用 java 类名 参数1 参数2 参数 3
E:\Code\Java\javaDemo\src\Chapter6>java Calculator 1 x 3

 */

public class Calculator {
    private static float result;

    private static void caculat(float op1, char sign, float op2)
            throws  ArithmeticException, IllegalSignException {
        switch (sign) {
            case '+':
                result = op1 + op2;
                break;
            case '-':
                result = op1 - op2;
                break;
            case 'x':
                result = op1 * op2;
                break;
            case '/':
                if (op2==0){
                    throw new ArithmeticException("");
                }
                result = op1 /op2;
                break;
            default:
                throw new IllegalSignException("运算符输入错误！");

        }

    }

    public static void main(String[] args) {
        float in0, in2;
        char in1;

        try {
//            Scanner in = new Scanner(System.in);
//            in0 = in.nextFloat();
//            in1 = in.next();
//            in2 = in.nextFloat();

            in0 = Float.parseFloat(args[0]);
            in1 = args[1].charAt(0);
            in2 = Float.parseFloat(args[2]);
            caculat(in0, in1, in2);
            System.out.println(in0 + " " + in1 + " " + in2 + "=" + result);
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch (IllegalSignException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("谢谢使用!");
        }
    }
}
class IllegalSignException extends Exception{
    IllegalSignException(String s){
        super(s);
    }
}