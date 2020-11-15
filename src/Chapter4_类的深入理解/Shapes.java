package Chapter4_类的深入理解;//方法覆盖实现多态



import java.util.Random;

/*

基于父类创建子类时，可以将子类对象赋给父类对象，反之则不能
此时父类对象依然只能调用自身所拥有的成员变量和方法。
(被子类覆盖的方法除外，此时父类对象调用的实际是子类对象的覆盖方法)以及访问自身的成员变量。
 */
//创建一个基类(父类)Shape  shape :形状  draw:画画  erase:擦除
 class Shape {
     public void draw(){

     }
     public void erase(){

     }
}
//基于Shape创建三个它的子类 Circle、Triangle、Square  圆、三角、矩形
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle.darw()");
    }
    public void erase(){
        System.out.println("Circle.erase()");

    }
}
class Triangle extends Shape{
    public void draw(){
        System.out.println("Triangle.darw()");
    }
    public void erase(){
        System.out.println("Triangle.erase()");

    }
}
class Square extends Shape{
    public void draw(){
        System.out.println("Square.darw()");
    }
    public void erase(){
        System.out.println("Square.erase()");

    }
}
//创建一个随机生成一个图形的类 RandomShapeGenerator random 随机的  shape形状 generator 生产器
class RandomShapeGenerator{
     //创建random类型rand随机数生成器，设置种子为长整型数47
   Random rand = new Random(47);
  //创建一个返回shape的方法
    public   Shape next(){
        switch (rand.nextInt(3)){
            default:return null;

            case 0:
                return new Circle();
            case 1:
                return new Triangle();
            case 2:
                return  new Square();
        }
    }
}
//定义一个公共类，
public class Shapes{
     //定义私有静态对象 gen  由于main函数通常定义为静态方法。要在main函数中调用gen，需要把gen也设置为static
    private static RandomShapeGenerator gen = new RandomShapeGenerator();
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];//创建一个长度为10 的 shape类数组
       for (int i = 0;i<shapes.length;i++){//for 循环给数组赋值
           shapes[i] = gen.next();
       }
       for (Shape s:shapes){//for循环遍历数组shapes，把值赋给临时Shape对象s
           s.draw();

       }
    }
}