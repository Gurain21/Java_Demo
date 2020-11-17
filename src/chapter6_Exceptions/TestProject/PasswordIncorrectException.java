package Chapter6_异常处理.TestProject;
//incorrect 错误的  correct 正确的
//该异常
public class PasswordIncorrectException extends Exception {
    PasswordIncorrectException(){

    }
    PasswordIncorrectException(String message){
        super(message);
    }
}
