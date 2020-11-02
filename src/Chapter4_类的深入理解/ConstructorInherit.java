package Chapter4_类的深入理解;
//构造方法的继承

class PersonA {
    String name;
    int age;
    //有参构造方法

    public PersonA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //无参构造
    public PersonA() {
        this.name = "perosn name";
        this.age = 23;
    }

    //成员方法
    void pprint() {
        System.out.println("class: Person;" + "Name:"+ this.name +";  age : "+this.age);

    }
}
//定义子类
class StudentA extends PersonA{
    String name;
    int classno;
    public StudentA() {
        super("xyz",30);
        this.name = "student name";
        this.age = 20;
    }
    public StudentA(String name,int age, int classno) {
        super(name,age);
        this.name = name;
        this.age = age;
        this.classno = classno;
    }
    void sprint(){
        System.out.println("class : Student;" +"Name :" +this.name +
                " ; age :" +this.age + "; classno: " +this.classno);
        System.out.println("父类中的name成员变量："+super.name);
    }
}

public class ConstructorInherit {
    public static void main(String[] args) {
        //调用无参构造方法创建对象
        StudentA obj1 = new StudentA();
        //有参构造
        StudentA obj2 = new StudentA("李华",18,01);
        obj1.pprint();
        obj1.sprint();
        obj2.pprint();
        obj2.sprint();
    }
}
/*
在JAVA中，super关键字代表当前对象的直接父类
访问父类的无参构造方法 super();
访问父类的有参构造方法 super(参数列表);
访问父类的成员变量 super.成员变量名称;
 */
