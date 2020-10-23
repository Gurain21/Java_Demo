package Chapter3;

public class Fruit {
    private String name;
    private  boolean seedes;//有种和无种
    private  boolean seasonal;//应季与非应季
    private float price; //价格
    //定义了一个Fruit 设置水果属性的方法
    public void  setPrioperties(String thisname,boolean seed,boolean season,float cost){
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
    }
}
