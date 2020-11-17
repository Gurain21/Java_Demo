package chapter3_OOP;
/*
复合型数据：interface、class、array 参数传递：引用传递，传递的是对象的地址。
 */
public class PassAdress {
    int a =25,b=5;
    static void doPower(PassAdress p){
        p.a += 5;
        p.b*=3;
    }

    public static void main(String[] args) {
        PassAdress p =new PassAdress();
        System.out.println("传递之前a和b的数值分别时；"+p.a+"、"+p.b);

        doPower(p);//复合数类型参数传递：引用传递。传递的是对象p的地址。
        System.out.println("传递之后a和b的数值分别时；"+p.a+"、"+p.b);

    }
}
