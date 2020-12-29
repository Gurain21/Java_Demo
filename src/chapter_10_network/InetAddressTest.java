package chapter_10_network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//ip地址 InetAddress类 这个类没有公共的构造方法 但是提供了3 个静态方法
public class InetAddressTest {
    public  static  void  main(String[] args){
        InetAddress inetAddress;
        //获取本地主机的ip地址
        try {
            inetAddress = InetAddress.getLocalHost();
            System.out.println(inetAddress);//输出本地主机ip地址
            String address = inetAddress.getHostAddress();
            String hostName = inetAddress.getHostName();//主机名
            System.out.println(hostName+":"+address);//主机主机ip地址
            InetAddress ia = InetAddress.getByName("www.baidu.com");//通过主机名获取百度网主机ip地址
            System.out.println(ia);//www.baidu.com/36.152.44.95

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
