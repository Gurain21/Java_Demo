//package otherDemo.DemoTotalClass;
//
//import java.lang.reflect.Constructor;
//
//public class ClassUpdateJava {
///***、JAVA的反射
// JAVA反射机制是在运行状态中，对于任意一个类，都能够知道这个类的所有属性和方法；
// 对于任意一个对象都能够调用它的任意一个方法和属性。这种动态获取的信息以及动态调用对象的方法功能称为Java语言的反射机制。
// ***、要想解剖一个类，就必须要先拿到该类的字节码文件对象，而解剖使用的就是Class类中的方法。
// 所以先要获取到每一个字节码文件对应Class类型的对象
//
// 一个类，进入到内存，对这个类进行解剖
// 直接获取成员运行
// xxx.Class 文件进入内存后,产生一个对象,由JVM创建,我们可以获取、
// 使用这个对象(class 文件的对象)方法,解剖这个类
//
// 要解剖的类的构造方法,会被看做一个对象,就有这个对象描述类,用于操作构造方法
// java.lang.reflect.Constructor 提供方法用于操作 构造方法
//
// 要解剖的类的成员变量,也会被看成一个对象,就有这个对象描述类,用于操作成员变量
// java.lang.reflect.Field 类提供方法用于操作 成员变量
//
// 要解剖的类的成员方法,也会被看成一个对象,就有这个对象的描述类,用于操作成员方法
// java.lang.reflect.Method 提供方法操作成员方法
//
//
// 反射:获取一个类的class文件对象 Class类型
// 使用Class类中的方法解剖这个class文件
//
// 获取出clss文件中定义的所有成员,交给不同的对象 进行处理
//
//
//
//
//
// Class类提供一些获取方法，从一个类的class文件中获取构造方法
// 获取所有类的公共权限构造方法
// Constructor[] getConstructors()获取类中的所有 public 权限的构造方法
// Constructor getConstructor(Class ...c) 返回指定的构造方法(用参数列表区分)
//
// Constructor 类中有一个方法，可以获取到的构造方法
// Object newInstance(Object ...obj)
// 运行获取到的指定构造方法，但是传递相对应的构造参数
//
// Constructor 类中有一个方法,可以获取到类的私有方法
// getDeclaredConstructor(参数列表);
// 但不能直接运行这个类的私有的方法，需要用一个方法临时取消掉这个私有权限
// setAccessible(true);
//
//
// 获取成员变量
// Class类提供获取方法，从一个类的class文件中获取成员变量
// Field[]  getFields() 获取所有公共权限成员变量 ，获取私有（getDeclaredFiles）
// Field getFields(字符串的变量名) 获取指定成员变量。
//
// 修改成员变量的值
// set(obj,value); 这个对象不要用new去创建，尽量是通过用 newInstance();方法创建它的obj
//
// 获取成员方法
// 自己的、继承的
// Method[] getMethods() 获取到所有的方法，包括继承的。public权限
// Method getMethod(字符串方法名，Class ...c) 获取指定的方法  两个参数
// 第一个参数是方法名，第二个参数是参数列表
//
// Method类方法
// invoke(Object obj,Object ...o)运行获取到的方法 第一个参数必填,用于指定对象
// 第二个参数可选,无参方法时不填,有参方法直接传递实参.
// 对象 调用方法实际传递的参数
// method.invoke(clazz.newInstance(),"隔壁老王安川")
//
//
//
//
// 获取类的字节码文件的三种方式。
// 第一种：通过对象的getClass方法获取这个类的动态的Class字节码文件对象
// 第二种：通过类的静态属性Class获取这个类的动态的Clss字节码文件对象
// 第三种： 通过Class包下的forname方法   Class.forName(String)  string应是完整的类名：包名.类名
// 获取的是string字符串中的字节码文件对象
//
// */
////
////import java.lang.reflect.Constructor;
////import java.lang.reflect.Method;
////import java.util.Calendar;
////import java.util.Random;
//
//    public class Entrance {
//        public static void main(String[] args) throws Exception {
//            //获取字节码文件的三种方式
//        /*
//        1、类名.class
//        2、Class.forName( )
//        3、实例化对象.getClass();
//         */
////        Class stucls01 = Student.class;//不推荐,获取的是固定的
////
////        //通过可以获取该目录下的某一个字节码文件 接口
////        Class stucls02 = Class.forName("demo01.MysqlDriver");
////
////
////        Class stucls03 = new Student().getClass();//不推荐,只能获取public类的class字节码文件
////
//////        Object obj1 = stucls02.newInstance();//当构造函数为private时,直接实例化该对象会报错.
////        Constructor constructor = stucls02.getDeclaredConstructor(String.class);//获取构造函数 getDeclaredConstructor()
////        constructor.setAccessible(true);//将该构造函数设置为可读取的 构造函数.setAccessible(true)  private 改为 public
////        Object instance = constructor.newInstance("邬大壮");//创建一个该构造函数的一个实例化对象 :
////        System.out.println(instance); //打印这个实例化对象的地址
//
//
//            Class class1 = Class.forName("demo01.MysqlDriver");
//            Constructor con = class1.getConstructor(String.class);
//            Object o = con.newInstance("隔壁老王安川");
//
//            //不创建对象,直接获取方法
////        Method[] methods = class1.getMethods();//获取class1的所有方法
////        Method[] methods = class1.getDeclaredMethods();//获取我们自己创建的方法,系统的排除掉
////        Method method1 = class1.getDeclaredMethod("Executer", String.class);//获取我们自己创建的单个方法,系统的排除掉
////        for (Method m:methods){
////            System.out.println(m);
////        }
//            //使用方法他的对象调用这个方法
//
////        Calendar t = Calendar.getInstance();
////        method1.invoke(class1.newInstance(), "你是狗");
//
//
//        }
//    }
//
//
//
//}
