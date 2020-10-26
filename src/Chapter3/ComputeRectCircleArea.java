package Chapter3;

public class ComputeRectCircleArea {
    final double PI = 3.14;
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
