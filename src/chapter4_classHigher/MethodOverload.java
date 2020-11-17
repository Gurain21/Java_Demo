package chapter4_classHigher;//方法重载实现多态


public class MethodOverload {
    //定义一个int类型的add方法
    int add(int a, int b) {
        return a + b;
    }

    //定义一个double类型的add方法
    double add(double a, double b) {
        return a + b;
    }

    //再定义一个double类型的add方法
    double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        System.out.println(obj.add(1, 2));
        System.out.println(obj.add(1.2, 2.2));
        System.out.println(obj.add(1.1, 2));
    }

}
