package chapter7_Stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/** ʹ���ļ��ֽ����������ݵ��ļ��У�Ȼ���ٴ��ļ��а�д������ݶ�����
 *
 *
 */
public class FileIOExample1 {
    public static void main(String[] args) throws IOException {
        String filePath = "E:\\Code\\Java\\javaDemo\\src\\chapter7_Stream\\testFile1.txt";
        FileOutputStream fos = new FileOutputStream(filePath);
        for (int i = 1;i<=10;i++){
            fos.write(i);
        }
        fos.close();
        FileInputStream fis = new FileInputStream(filePath);
        int value;
        while (( value = fis.read())!= -1){
            System.out.println(value+ " ");
        }
        fis.close();
    }
}
