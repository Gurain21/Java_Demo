/**
 * 将class变为可序列化，输出一个文件Box.txt
 */

import java.io.*;

public class Box implements Serializable {
    private int height;
    private int width;

    public Box(int width,int height){
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        try{
            FileOutputStream fops = new FileOutputStream("Box.txt");
            ObjectOutputStream oops = new ObjectOutputStream(fops);
            Box obj = new Box(3,4);
            oops.writeObject(obj);
        }catch (IOException e){
            
        }

    }
}