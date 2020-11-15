package Chapter4_类的深入理解;

/*
接口的定义:
    和抽象类的作用类似,接口也可以把 "做什么"和 "怎么做"即程序的功能和实现分离开来;
    接口可以看作更严格的抽象类.在接口中.只能定义若干个公共静态变量和抽象方法,从而实现一个属性集合.
    该属性集合通常会对应某一种特定的功能.凡是需要这种功能的类,都可以继承这个接口并实现它的功能.


在JAVA中,一个类只能直接继承一个父类,但可以同时继承多个接口.因此,利用接口可以获得多个特殊父类的属性和方法.即实现了多继承.
接口和抽象类的关系如下:
1、接口中只能定义抽象方法，而抽象类可以定义非抽象方法；
2、接口中只能由public static final类型常量，不能包含成员变量。抽象类则可以包含各种形式的成员变量和常量；
3、一个类可以继承(实现)多个接口，但只能直接继承一个抽象父类。
4、类由严格的层次结构，而接口不是类层次结构的一部分，没有联系的类也可以实现多个接口。
接口的注意点：
    1、由于接口中的所有常量都默认为public static final 类型 ，所以编写程序时可以省略这些修饰符
    2、如果一个类要实现一个接口，那么这个类就要提供接口中定义的所有抽象方法的实现，否则该类就必须时抽象类；因为抽象类可以不用有具体实现；
    3、接口声明中有两个部分时必须的，interface关键字和接口的名字，用public修饰的是公共接口，可以被所有的类和接口使用
        而没有public修饰的接口只能被所在包的其它类和接口使用。
    4、已定义的接口中要添加功能时，尽量不要直接在接口中添加方法、而是新建一个子接口继承这个接口，在子接口中扩展新的功能，这样可以避免已经实现这个接口的类变成抽象类。（
[public] interface 接口名 extends [父接口名列表]{
//常量声明
//抽象方法声明

}
 */
//定义一系列的接口
interface VideoCard {//显卡

    void getName();                  //获取显卡名称

    void getVideoCardMemory();      //获取显存容量
}

interface Memory {
    void getMemoryVolume();        //获取内存条容量

    void getMemoryType();          //获取内存条类型
}

interface CPU {
    void getCPUName();     //获取cpu的名称

    void getCPUSpeed();     //获取cpu速度
}

interface AudioCard {
    void getAudioCardName(); //获取声卡名称
}

interface MainBoard {//主板

    void setCPU(CPU cpu);  //cpu

    void setMemory(Memory memory);//

    void setVideoCard(VideoCard vc);

    void setAudioCard(AudioCard ac);
}

//一组类，用来继承和实现上面的接口
class VideoCardImpl implements VideoCard {

    @Override
    public void getName() {
        System.out.println("The video card name is Winfast");
    }

    @Override
    public void getVideoCardMemory() {
        System.out.println("The video card memory is 256M");
    }
}

class MemoryImpl implements Memory {

    @Override
    public void getMemoryVolume() {
        System.out.println("The memory volume is 2GB");
    }

    @Override
    public void getMemoryType() {
        System.out.println("The memory type is DDR2");
    }
}

class CUPImpl implements CPU {

    @Override
    public void getCPUName() {
        System.out.println("The CUP name is Intel");
    }

    @Override
    public void getCPUSpeed() {
        System.out.println("The CPU speed is 2.8G");
    }
}

class AudioImpl implements AudioCard {

    @Override
    public void getAudioCardName() {
        System.out.println("The Audio card name is Ac97");
    }
}

class MainboardImpl implements MainBoard {

    @Override
    public void setCPU(CPU cpu) {
        cpu.getCPUName();
        cpu.getCPUSpeed();
    }

    @Override
    public void setMemory(Memory memory) {
        memory.getMemoryType();
        memory.getMemoryVolume();
    }

    @Override
    public void setVideoCard(VideoCard vc) {
        vc.getName();
        vc.getVideoCardMemory();
    }

    @Override
    public void setAudioCard(AudioCard ac) {
        ac.getAudioCardName();
    }
}
//定义公共类
public class InterfaceExample{
    public static void main(String[] args) {
        //实例化一个mainbroad
        MainBoard mb = new MainboardImpl();
        //将需要的接口类型传值进去 (由于这个类实现了接口，那么可以把这个类传进去，因为这个类实现了接口中的所有抽象方法嘛。)
        mb.setVideoCard(new VideoCardImpl());
        mb.setAudioCard(new AudioImpl());
        mb.setCPU(new CUPImpl());
        mb.setMemory(new MemoryImpl());
    }
}