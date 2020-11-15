package Chapter3_面对对象程序设计;

public class StaticDemo {
    private  int x;
    private  static  int y;
    public static void setXY1(int newX,int newY){
//        x = newX;// x 会报红 因为类方法中只能访问到类变量
        y  =newY;
    }
    public void setXY2(int newX,int newY){
        x = newX;
        y = newY;
    }

    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo();
        demo1.setXY1(10,32);//报黄，不推荐实例化对象使用类方法
        demo1.setXY2(10,32);
        StaticDemo.setXY1(10,32); //setXY1的正确用法

    }
}

/*
static：静态方法 或称之为 类方法
1、类方法只能访问类变量，不能访问实例变量。
而实例方法既可以访问类变量也可以访问实例变量
2、类方法可以直接通过类名调用，而实例方法不能直接通过类名调用
但实例化创建了对象后，通过这个对象名既能调用类方法也能调用实例方法
 */