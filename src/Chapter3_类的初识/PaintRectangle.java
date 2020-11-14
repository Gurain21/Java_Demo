package Chapter3_类的初识;

import java.awt.*;

public class PaintRectangle extends Frame {
    private int x,y,width,height;
    public void init(){
        this.setSize(400,200);
        this.setBackground(Color.PINK);
        this.setVisible(true);
    }
    public PaintRectangle(){
        x =0;
        y=0;
        width=0;
        height=0;
    }
    public PaintRectangle(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width =width;
        this.height = height;
    }
    public void setPosition(int x,int y,int width,int height){
        this.x = x;
        this.y = y;
        this.width =width;
        this.height = height;
    }

    public void draw(Graphics g){
        g.drawRect(x,y,width,height);
    }
    public void paint(Graphics g) {//重写父类的paint方法

        PaintRectangle b1;
        b1 = new PaintRectangle();
        b1.setPosition(100,50,30,20);
       PaintRectangle b2 =new PaintRectangle(170,40,60,60);
       b1.draw(g);
       b2.draw(g);
    }

    public static void main(String[] args) {
        PaintRectangle p1= new PaintRectangle();
        p1.init();
        System.gc();//显示的运行垃圾回收程序//一般来说java内置的GC机制足够用了
        try {
            p1.finalize();//已弃用的finalize方法
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
