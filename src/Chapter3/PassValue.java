package Chapter3;

public class PassValue {
    static void doPower(int i,int j){
        i+=5;
        j*=3;
        System.out.println("传递之后i和j的值分别是："+i+"、"+j);
    }

    public static void main(String[] args) {
         int a = 12,b =20;
        System.out.println("传递之前a和b的值分别是："+a+"、"+b);

        doPower(a,b);//值传递，简单数据类型传递传递的类型是值传递。
        System.out.println("传递之后a和b的值分别是："+a+"、"+b);

    }
}
