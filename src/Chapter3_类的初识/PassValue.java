package Chapter3_类的初识;
/*
值传递和引用传递：值传递是将源数据拷贝一份数据传递给调用处、拷贝的数据被更改不会影响到源数据、
引用传递则是直接将源数据的底层内存地址传递给调用处、调用处更改这份数据相当于把源数据也一同修改了、
 */
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
