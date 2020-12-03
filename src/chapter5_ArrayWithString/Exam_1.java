package chapter5_ArrayWithString;
class Student{
    String name;
    int age;
    public Student(String name ,int age){
        this.name = name;
        this.age = age;
    }
}
public class Exam_1 {
    public static void main(String[] args) {
        Student[] stus= new Student[3];
        stus[0] = new Student("lily",20);
        stus[1] = new Student("lucy",18);
        stus[2] = new Student("john",21);
        for (Student s: stus){
            System.out.println(s.name+"      "+s.age);
        }
    }
}
