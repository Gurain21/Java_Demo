package Chapter6_异常处理.TestProject;
//Validate : 验证
/*
该类用于验证用户名和密码类
 */

public class Validate {
    private String acount,passorwd;

    public String getAcount() {
        return acount;
    }

    public String getPassorwd() {
        return passorwd;
    }

    public void setAcount(String acount) {
        this.acount = acount;
    }

    public void setPassorwd(String passorwd) {
        this.passorwd = passorwd;
    }
    //验证账号是否存在
    public boolean validateAccount(String acount){
        if (acount.equals("aaa")){
            return true;
        }
        return false;
    }
    //验证账号和密码是否正确
    public boolean validatePassword(String acount,String passorwd){
        if (acount.equals("aaa")&&passorwd.equals("111")){
            return true;
        }
        return false;
    }
    //登录操作函数
    public void login(String acount,String passorwd)throws AccountNotExistException,PasswordIncorrectException{
        if (!validateAccount(acount)){
            throw new  AccountNotExistException("该账号不存在！");
        }
        if (!validatePassword(acount, passorwd)){
            throw  new PasswordIncorrectException("密码不正确！");
        }
    }
}
