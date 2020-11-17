package chapter3_OOP;

//贷款类Loan
public  class Loan {

    private double monthlyInteresRate; //定义贷款月利率
    private int numberOfMonths; //定义贷款总月数
    private double loanAmount;//定义贷款金额
    //构造方法


    public Loan() {
    }
    public Loan(double monthlyInteresRate, int numberOfYears, double loanAmount) {
        //一般情况下,我们说贷款利息是5.5,它实际上应是5.5%,因此,
        //真正的利息值应该是该数值除以100,这是一年的利息,至于月息,应该再除以12
        this.monthlyInteresRate = monthlyInteresRate / (100 * 12);
        this.numberOfMonths = numberOfYears * 12;
        this.loanAmount = loanAmount;
    }

    //返回等额本息还款方式下的月均还款额公式为:  (贷款本金*月利率*(1+月利率)^还款月数)/
    //                                           (1+月利率)*还款月数-1
    public double getMonthlyPayment() {
        return (loanAmount * monthlyInteresRate * Math.pow(
                1 + monthlyInteresRate, numberOfMonths))/
                Math.pow(1 + monthlyInteresRate, numberOfMonths - 1);
    }
    //返回等额本息还款方式下支付的总本息
    public double getTotalPayment(){
        return getMonthlyPayment() * numberOfMonths;
    }
}
