package chapter3_OOP;
/*
类变量、实例变量

 */
public class ConcentCircle {
    public static  int x = 100,y=100;//静态变量，被该类的所有对象共享，在任意一个对象中改变了x,y的值，也就改变了该类所有对象的x,y值
    public int r ;//成员变量（实例变量）：与实例的对象有关，改变一个其中对象的 r 值也不会对其它对象的  r 值
    public static final double PI =3.1415;//公共静态常量 运行过程中不能被改变 的值，通常用大写字母来表示常量；
    public static void main(String[] args) {
        ConcentCircle t1 = new ConcentCircle();
        ConcentCircle t2 = new ConcentCircle();
        t1.x += 100;
        t1.r =50;
        t2.x+=200;
        t2.r = 150;

        System.out.println("Circle1:x = "+t1.x+" y = "+t1.y+" r = "+t1.r);
        System.out.println("Circle2:x = "+t2.x+" y = "+t2.y+" r = "+t2.r);
    }
}
