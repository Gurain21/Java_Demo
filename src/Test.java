class Test{
    public static void main(String[] args) {
       Animal dog = new Dog();
       Fruit dog2 = new Dog();
       dog.run();
       dog2.eat();
    }
}
abstract class Animal{
    abstract void run();
}
class Dog extends Animal implements Fruit{
    @Override
    void run() {
        System.out.println("Hi,I am running!");
    }

    @Override
    public void eat() {
        System.out.println("Hello,I am eating");
    }
}
interface Fruit {
    String sum = "20元";
    void eat();

}