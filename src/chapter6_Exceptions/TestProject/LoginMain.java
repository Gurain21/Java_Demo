package Chapter6_异常处理.TestProject;

import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) {
        Validate validate = new Validate();
        Scanner in = new Scanner(System.in);
        System.out.println("请输入账号：");
        validate.setAcount(in.nextLine());
        System.out.println("请输入密码：");
        validate.setPassorwd(in.nextLine());
        try {
            validate.login(validate.getAcount(),validate.getPassorwd());
            System.out.println("登录成功！");
        }catch (AccountNotExistException | PasswordIncorrectException e){
            System.out.println(e.getMessage());
        }
    }
}
