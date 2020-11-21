package chapter7_Stream;

import java.lang.String;

import java.io.*;

public class SystemIOExample3 {
    public static void main(String[] args) throws IOException {
        // TODO: 2020/11/20  new一个文件输出流fos
        FileOutputStream fos = new FileOutputStream("E:\\Code\\Java\\javaDemo\\src\\chapter7_Stream\\test3.txt");
        // TODO: 2020/11/20  通过文件输出流 new一个输出缓冲区
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        // TODO: 2020/11/20 准备要写入的数据
        String s = "写入到test3.txt的一句话：\n“愿中国青年都摆脱冷气，只是向上走，不必听自暴自弃者流的话。\n能做事的做事，能发声的发声。有一分热，发一分光，就令萤火一般，也可以在黑暗里发一点光，不必等候炬火。此后如竟没有炬火：我便是唯一的光。”";
        bos.write(s.getBytes());// TODO: 2020/11/20 通过string类的内置方法将字节切片写入缓冲区。也就是文件test3.txt中
// TODO: 2020/11/20  flush清除缓冲区内容,把缓冲的数据一次性写入到文件中。close关闭缓冲区
        bos.flush();
        bos.close();
        //运行到这里就已经生成了一个文件了
        FileInputStream fis = new FileInputStream("E:\\Code\\Java\\javaDemo\\src\\chapter7_Stream\\test3.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        // TODO: 2020/11/20  new一个字节数组...用于从缓冲区里读取文件
        byte[] fileBytes = new byte[1024];

        System.out.println(new String(fileBytes, 0, bis.read(fileBytes)));
        // TODO: 2020/11/20 关闭流

        bis.close();


    }
}
