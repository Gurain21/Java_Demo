package Demoabstruct;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void goHome(Vehicle vehicle){
        System.out.println(this.name+"下班回家了。。。");
            vehicle.run();
    }
}
