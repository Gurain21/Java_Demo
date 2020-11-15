package Chapter4_类的深入理解;
/*
本章小结：
在使用子类创建对象时，可以利用子类对象名直接引用父类中的成员变量和成员方法，这被称为成员变量和成员方法的继承。
如果在子类中重定义了某个父类的成员变量，则使用它子类创建对象时，子类中的方法操作的是子类中的成员变量，而父类中的方法操作的是父类的成员变量，这被称为成员变量的隐藏。
如果在子类中重定义了父类中的某个成员方法，则利用子类创建对象时，父类中的同名方法将被覆盖。即无论是子类还是父类，其它方法调用本方法时，实质上调用的都是子类中的方法。
使用子类创建对象时，父类的无参构造总是优先被执行，这被称为构造方法的继承。当然，我们也可以利用super关键字显式调用父类的其它构造方法
在Java中，我们可以将基于子类创建的对象声明为父类对象，或者说可以将基于子类创建的对象赋值给父类对象，这对实现程序的多态性非常有用。
多态性被称为“一个对外接口，多个内在实现方法”，它可以通过方法覆盖和方法重载来实现。其中，所谓重载方法是指：多个方法的方法名相同，但方法的参数类型、个数、顺序有所区别，并且返回的类型也可以不同。在调用这类方法时，系统会自动根据参数情况来决定调用哪个方法。
抽象类和接口的主要目的都是为了是程序的功能描述和实现相分离，并且一个功能描述可以对应多个实现方法，从而实现了程序的多态性。
抽象类除了可以包含抽象方法以外，其它性质与普通类完全相同，抽象类自身不能实例化，抽象方法的实现应通过其派生子类来完成。
接口是更严格的抽象类，其中只能包含publi static final成员常量和抽象方法。
一个子类只能直接继承一个抽象类，但可以同时继承多个接口，这实现了程序设计中的多继承关系。


 */
//定义一个抽象类Student2
abstract class Student2{//属性 id、name 、className. 方法: 注册、注销
    public String id;
    public String name;
    public String className;
    public abstract void register();// 抽象类方法不能定义为private修饰符
    public abstract void  clearOut();

}
//本科生类，继承抽象父类 Student2
class UnderGraduate extends Student2{
private String counsellors; //私有变量，辅导员
    @Override
    public void register() {
        System.out.println("本科生注册，注册成功！");
    }

    @Override
    public void clearOut() {
        System.out.println("本科生注销、注销成功！");
    }
}
//研究生类
class Graduate extends Student2{
    private String instructor;//导师
    private String reseach;//研究方向
    @Override
    public void register() {
        System.out.println("研究生注册，注册成功！");
    }

    @Override
    public void clearOut() {
        System.out.println("研究生注销，注销成功！");
    }
}
//公共类 学生管理
public class StudentManager {
    public  void  add(Student2 s){//学生注册
        s.register();
    }
    public void delete(Student2 s){
        s.clearOut();
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        Student2 underGraduate = new UnderGraduate();
        Student2 graduate= new Graduate();
        sm.add(underGraduate);
        sm.delete(underGraduate);
        sm.add(graduate);
        sm.delete(graduate);
    }
}
