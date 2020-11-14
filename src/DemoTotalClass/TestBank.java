package DemoTotalClass;

import com.sun.tools.javac.Main;

public class TestBank extends Exception{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.login();
    }
}
