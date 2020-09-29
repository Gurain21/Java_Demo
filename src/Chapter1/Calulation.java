package Chapter1;
//定义了加和减两个类，并在main函数使用
class  Add{
    int x,y;
    Add(int num1,int num2){
        x =num1;
        y= num2;
    }

    public Add() {

    }

    int getSum(){
        return x + y;
    }
}
class Sub{
    int x,y;
    Sub(int num1,int num2){
        x =num1;
        y =num2;
    }
    int getDif(){
        return x-y;
    }
}
class  Calculation{
    public static void main(String[] args) {
        Add add =new Add();
        add.x = 3;
        add.y = 10;
        System.out.println(add.x +"+"+add.y+"="+add.getSum());
        Sub sub = new Sub(10 ,1);
        System.out.println(sub.x +"+"+sub.y+"="+sub.getDif());
    }

}