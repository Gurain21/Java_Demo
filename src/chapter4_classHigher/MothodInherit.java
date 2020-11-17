package chapter4_classHigher;//方法的继承  覆盖和隐藏的区别：
class parentclass {
    //声明成员方法
    void pprint(){
        this.print();
        this.print1(0);
    }
    //声明同类型同参数的方法
    void print (){
        System.out.println("父类 : 同类型，同名，同参数的成员方法");
    }
    //声明同类型同但不同参数的方法
    void print1 (int a){
        System.out.println("父类 : 同类型，同名，不同参数的成员方法！");
    }
}
class  subclass extends parentclass{
    //声明成员方法
    void sprint(){
        this.print();
        this.print1(0);
    }
    //声明同类型同参数的方法
    void print (){
        System.out.println("子类 : 同类型，同名，同参数的成员方法");
    }
    //声明同类型同但不同参数的方法
    void print1 (){
        System.out.println("子类 : 同类型，同名，不同参数的成员方法！");
    }
}
public class MothodInherit {
    public static void main(String[] args) {
        subclass obj1 = new subclass();
        obj1.pprint();
        obj1.sprint();
    }
}
//子类 : 同类型，同名，同参数的成员方法
//        父类 : 同类型，同名，不同参数的成员方法！
//        子类 : 同类型，同名，同参数的成员方法
//        父类 : 同类型，同名，不同参数的成员方法！
/*
方法覆盖： 当父类的成员方法的 类型，名称，参数以及参数顺序与 子类的成员方法 完全相同时，子类的方法会覆盖父类的方法
*方法覆盖和成员变量隐藏不同之处在于：
        被隐藏了的父类的成员变量只是使之看不见，但他还存在于子类对象中，依旧占用内存空间
        而覆盖则是清除了父类占用的内存空间，彻底消失在子类对象中。
     此外 ： 子类不能覆盖父类中的final方法和static方法，但能隐藏这两类方法，即在子类中声明与父类完全相同的final方法和static方法。
 */