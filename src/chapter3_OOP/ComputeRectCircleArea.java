package chapter3_OOP;
/*
定义两个方法，返回长方形和圆形的面积
 */
public class ComputeRectCircleArea {
    final double PI = 3.14; //final 最终变量 也叫常量。程序运行过程中值无法改变。
    double length,width,radius;
    double rectarea(){
        return length*width;
    }
    double circlearea(){
        return PI*radius;
    }
    ComputeRectCircleArea(double width,double length){
        this.length =length;
        this.width =width;
    }
    ComputeRectCircleArea(double radius){
        this.radius =radius;
    }

    public static void main(String[] args) {
        ComputeRectCircleArea rect =new ComputeRectCircleArea(20,30);
        ComputeRectCircleArea circle =new ComputeRectCircleArea(30);
        System.out.println(rect.rectarea());
        System.out.println(circle.circlearea());
    }
}
