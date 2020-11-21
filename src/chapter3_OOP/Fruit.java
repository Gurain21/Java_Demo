package chapter3_OOP;

import java.io.*;

/*
什么是对象？
对象是一组数据和方法的集合、在java中，对象必须类来创建
什么又是类？
类是一组具有相同状态和行为的对象的概括、归纳与抽象表达。


JAVA是一个面对对象编程语言，面向对象的核心是类和对象面向对象三要素 :
            封装(Encapsulation) 继承(Inheritance) 多态(Polym)
            封装、继承、多态 面向对象的三大基本原则 封装(变量、属性、方法),继承(子类),多态(overload, override)
封装、继承、多态。
encapsulation (封装)：将代码及其处理的数据绑定在一起的一种编程机制，该机制保证了程序和数据都不受外部干扰且不被误用。
inheritance(继承)：面向对象程序设计中两个类之间的一种关系，是一个类可以继承另一个类(它的父类)的状态和行为。被继承的类被称为父类或超类，继承父类的类被称为子类。
Polym(多态)：多态性可以用“一个对外接口，多个内在实现方法”来表示。也就是说，我们可以在一个类中定义多个同名方法，程序在调用某个方法时，系统会自动根据参数类型、顺序和数量来调用不同方法。
多态的实现有两种方式：方法重载、方法覆盖(overload, override).

OOP  : 面向对象编程，object oriented programming
    编程思想：关注的是对象 把构成问题的某一事物分解成一个个对象，不是为了解决问题的某一步骤，而是描述某个事物在解决问题时的状态和行为。
POP :面向过程编程，procedure oriented programming
    编程思想：关注的时过程 分析出解决问题的步骤，然后通过函数去一个个实现这些步骤，
 */
public class Fruit {
    
    private String name;
    private  boolean seedes;//有种和无种
    private  boolean seasonal;//应季与非应季
    private float price; //价格
    //定义了一个Fruit 设置水果属性的方法
    public void  setPrioperties(String thisname,boolean seed,boolean season,float cost) {
        name = thisname;
        seedes = seed;
        seasonal = season;
        price = cost;
    }
    public void printPrioperties(){
        if (seedes){
            System.out.println(name+" is seedes");//有核的
        }else{
            System.out.println(name+" is seedless");//无核的
        }
        if (seasonal){
            System.out.println(name+" is seasonal");//水果是应季的

        }else {
            System.out.println(name+" is not seasonal");//水果不是应季的
        }
        System.out.println(name+"'s Price is"+price);
    }

    // 包含了main方法 说明Fruit 是该java程序的主类，即可以被运行的类
    public static void main(String[] args) {
        Fruit watermelon = new Fruit();
        watermelon.setPrioperties("watermelon",true,false,9.38F);
        watermelon.printPrioperties();
        Fruit f1 = new Fruit();
    }

}
