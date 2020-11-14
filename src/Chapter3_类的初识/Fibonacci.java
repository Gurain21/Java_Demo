package Chapter3_类的初识;

/*
递归函数，在函数的代码块中调用这个函数。通常会设有一个出口，不断调用自己的时候离出口也就越近了。
斐波那契数列的特点：
 从第三个数开始，每个数都是前两个数的和。
 递推公式为：
        = --0 (n =0)
 Fib(n) = --1 (n =1)
        = Fib(n-1)+Fib(n-2) (n>1)
 */
public class Fibonacci {
    public static long fib_1(int n) {//递归实现斐波那契数列
        long f1, f2;
        if (n == 0 || n == 1) {
            return n;
        } else {
            f1 = fib_1(n - 1);
            f2 = fib_1(n - 2);
            return (f1 + f2);
        }
    }

    public static long fib_2(int n) {
        long f1 = 0, f2 = 1;
        long sum = 0;
        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 1; i < n; i++) {
                sum = f1 +f2;
                f1 = f2;
                f2 =sum;
            }
            return sum;
        }
    }
    public static long fib_3(int n){
        long f1 = 0,f2 =1 ,sum = 0;
        if (n==0||n==1){
            return n;
        }else {
            for (int i =1;i<n;i++){
                sum =f1+f2;
                f1 =f2;
                f2 =sum;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            System.out.print(fib_1(i)+",");
        }
        System.out.println("");
        for (int i =1;i<=10;i++){
            System.out.print(fib_3(i)+",");

        }
    }
}
