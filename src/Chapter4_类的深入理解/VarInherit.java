package Chapter4_类的深入理解;
//成员变量的继承与隐藏
/*
如果一个成员变量同时再父类和子类中定义，那么，创建对象后，他们是同时存在的，
并且父类中的成员变量用于父类方法，子类的成员变量用于子类方法。互不干扰
因此，当子类中定义了与父类类型和名称都相同的成员变量时，子类从父类中继承的成员变量将会隐藏
 */
class Person {
    String name;
    int age;
    //有参构造
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //无参构造
    public Person() {//默认姓名为person name 年龄为 23
        this.name = "person name";
        this.age = 23;
    }

    void pprint() {
        System.out.println("class :Person;" +
                "name='" + this.name + '\'' +
                ", age=" + this.age
        );
    }


}
//基于Person类定义Student子类
class Student extends Person {
    String name;
    int classno;
    public Student(){
        this.name = "student name";

    }

    public Student(String name, int age, int classno) {
            this.name =name;
            this.age =age;
            this.classno = classno;
    }


    void sprint(){
        System.out.println("class :Student;" +
                "name='" + this.name + '\'' +
                ", age=" + this.age+" classno = "+this.classno);
    }
}

public class VarInherit {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student("王大幅",19,1);
        obj1.pprint();
        obj1.sprint();
        obj2.pprint();
        obj2.sprint();
    }
/* 输出结果
class :Person;name='person name', age=23
class :Student;name='student name', age=23classno0
class :Person;name='person name', age=19
class :Student;name='王大幅', age=19classno1
 */
}

