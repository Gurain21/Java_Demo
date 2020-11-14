package Chapter3_类的初识;

public class YYECFC {//一元二次方程
    double x1,x2;
    private double a,b,c;
    public YYECFC(double a,double b,double c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    //计算方程实根的方法
    void real_root(double delt){
        x1 = (-b +Math.sqrt(delt))/(2*a);
        x2 = (-b -Math.sqrt(delt))/(2*a);
        System.out.println("delt > 0 方程的实根为:\nx1="+x1+"\nx2="+x2);
    }
    //计算方程虚根的方法
    void imag_root(double delt){
        double real,imag;
        real = (-b)/(2*a);
        imag = Math.sqrt(-delt)/(2*a);
        System.out.println("delt < 0 方程的虚根为:\nx1="+real+"+"+imag+"i\nx2="+real+"-"+imag+"i");

    }
    void showRoot(){
        double delt =b*b-4*a*c;
        if (delt >0){
            real_root(delt);
        }else {
            imag_root(delt);
        }
    }

    public static void main(String[] args) {
        YYECFC y1 =new YYECFC(1,5,10);
        YYECFC y2 =new YYECFC(1,10,9);
        y1.showRoot();
        y2.showRoot();
    }
}
