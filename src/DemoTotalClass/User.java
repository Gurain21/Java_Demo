package DemoTotalClass;

public class User {
    //卡号 身份证号 用户名 密码 手机号 余额
    private String cardNo;
    private String identity;
    private String username;
    private String password;
    private String phone;
    private double banlance;
    public User(){

    }
   //构造方法重载
    public User(String cardNo, String identity, String username, String password, String phone, double banlance) {
        this.cardNo = cardNo;
        this.identity = identity;
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.banlance = banlance;
    }
    //get set

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBanlance() {
        return banlance;
    }

    public void setBanlance(double banlance) {
        this.banlance = banlance;
    }
}
