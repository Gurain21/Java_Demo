package chapter4_classHigher;

/*
抽象类：即类的抽象，是相对类似的对象的一种归纳与总结。因此，通常抽象类只包括了抽象方法。(抽象类也可以拥有自己的成员变量和成员方法。)
抽象类无法实例化，通常作为一个父类来实现多态。
抽象方法：只能出现在抽象类中，只有方法声明，没有方法实现的方法。方法的具体实现则有由抽象类的子类通过方法覆盖来实现。


抽象类的定义格式通常如下
public abstract class className{
    private String name;
    public abstract sayHi();

}
 */
abstract class PlaneGraphic {//平面图形抽象类
    private String shape;//私有变量 形状

    public PlaneGraphic(String shape) {//有参构造方法，将形状具体值赋值给shape
        this.shape = shape;
    }

    public PlaneGraphic() {//默认无参构造方法
        this.shape = "未知形状";
    }

    public abstract double area();//计算面积的抽象方法.分号必不可少

    public void print() {
        System.out.println(this.shape + "面积为:" + this.area());
    }
}

class Rectangle extends PlaneGraphic {
    protected double length;
    protected double width;

    public Rectangle(double length, double width) {//两个参数的构造方法
        super("长方形");
        this.length = length;
        this.width = width;
    }

    public Rectangle(double width) {//正方形构造方法,正方形是特殊的长方形
        super("正方形");//给继承来的shape成员变量赋值,默认调用父类的无参构造
        this.length = width;
        this.width = width;
    }

    public Rectangle() {//无参构造,此时length和width都为0;shape为"未知图形"

    }

    @Override
    public double area() {//方法覆盖实现父类的抽象方法
        return width * length;//计算长宽相乘
    }
}

//新建一个平面图形的子类:椭圆
class Eclipse extends PlaneGraphic {
    protected double radius_a;//a轴半径
    protected double radius_b;//b轴半径


    //        椭圆构造方法
    public Eclipse(double radius_a, double radius_b) {
        super("椭圆");
        this.radius_a = radius_a;
        this.radius_b = radius_b;
    }

    //圆构造方法 圆是特殊的椭圆,
    public Eclipse(double radius_a) {
        super("圆");
        this.radius_a = radius_a;
        this.radius_b = radius_a;
    }

    public Eclipse() {//无参构造方法.此时a.b都为0,形状为未知

    }

    @Override
    public double area() {//实现父类的计算面积的抽象方法
        return Math.PI * radius_a * radius_b;
    }
}
public class PlaneGraphic_ex {
    public static void main(String[] args) {
        PlaneGraphic g =new Rectangle(3,5);//通过父类planeGraphic 来new一个子类Rectangle
        //此时父类的抽象方法被子类的同名方法覆盖,有了具体实现.实现了程序的多态;
        g.print();
        g = new Rectangle(3);
        g.print();
        g = new Rectangle();
        g.print();
        g = new Eclipse(5);
        g.print();
        g = new Eclipse(5,4);
        g.print();
        g = new Eclipse();
        g.print();

    }
}

