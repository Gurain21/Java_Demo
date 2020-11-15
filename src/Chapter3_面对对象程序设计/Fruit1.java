package Chapter3_面对对象程序设计;

public class Fruit1 {//在同包下调用Fruit类
    public static void main(String[] args) {
        Fruit pear = new Fruit();
        pear.setPrioperties("pear",true,true,7.86F);
        pear.printPrioperties();
    }
}
