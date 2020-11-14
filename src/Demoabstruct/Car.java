package Demoabstruct;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void run() {
        System.out.println(super.getBrand()+"牌汽车正在前进");
    }
}
