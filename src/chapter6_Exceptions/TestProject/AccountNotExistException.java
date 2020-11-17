package Chapter6_异常处理.TestProject;
//account： 账户、账单
//账户不存在错误
public class AccountNotExistException extends Exception{
    AccountNotExistException(){

    }
    AccountNotExistException(String message){
        super(message);
    }
}
