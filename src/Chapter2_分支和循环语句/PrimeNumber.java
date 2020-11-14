package Chapter2_分支和循环语句;
/*
if
while
for
求一个数学题
 */

/*
程序在控制台中显示前30个素数，每行显示10个素数。在一个大于1的自然数中，如果它的正因子只有1和自身，那么该整数是素数。
 */
public class PrimeNumber {
    static final int NUMBER_PRIME = 30;
    static final int NUMBER_PRIME_PRINTLN = 10;


    public static void main(String[] args) {
        int count = 0;  //计数器
        int number = 2; //定义数字变量
        System.out.println("前三十个素数是：");
        while (count < NUMBER_PRIME) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {//divisor:除数，因子。
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;

                if (count % NUMBER_PRIME_PRINTLN == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
                ;
            }
            number++;
        }
        ShuShu ob = new ShuShu();
        ob.printShuShu();
    }
}

class ShuShu {
    public void printShuShu() {
        int count = 0;
        int num = 2;

        while (count < 30) {
            boolean isP = true;

            for (int divisor = 2; divisor <= num / 2; divisor++) {//divisor:除数，因子。
                if (num % divisor == 0) {
                    isP =false;
                    break;
                }
            }

           if (isP){
               count++;
               System.out.print(num +"、");
               if (count%10==0) System.out.println("");
           }
           num++;
        }
    }
}