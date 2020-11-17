package chapter4_classHigher;
/*
1 、 子类对象可以赋值给父类对象，但是不能把父类对象赋值给子类对象
2 、 即使将子类对象赋值给了父类对象，但父类对象也只能调用父类中的方法和成员变量(虽然它们已被偷梁换柱，置换成了子类的方法和成员变量)
 */
//创建父类 Pclass
class Pclass{
    void Draw(){
        //定义一个画画方法
        System.out.println("Pclass类，Draw方法！");
    }
}
//创建子类 Sclass,通过extends继承Pclass
class Sclass extends Pclass{
    void Draw(){
        System.out.println("Sclass类，Draw方法！");
    }
    void NewDraw(){
        System.out.println("Sclass类，NewDraw方法！");
    }
}
//创建公共类、创建main函数
public class ClassInherit {
    public static void main(String[] args) {
        Pclass obj1 = new Pclass();
        Sclass obj2 = new Sclass();
        obj1.Draw();
        obj2.Draw();
        obj2.NewDraw();
        //将子类对象赋值给父类对象
        obj1 = obj2;
        //此时父类obj1的Draw方法已经是子类对象obj2的Darw方法了
        obj1.Draw();
    }
}
