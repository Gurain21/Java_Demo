package chapter7_Stream;

import java.io.*;

// TODO: 2020/11/22 使用文件字符输入/输出流类将键盘输入的字符写入文件中
public class FileIOExample2 {
    public static final  String  filename = "E:\\Code\\Java\\javaDemo\\src\\chapter7_Stream\\FileTest2.txt";
    public static void readFile() throws IOException {
        FileReader fr = new FileReader(filename);
        char[] data = new char[1024];
        int nums = fr.read(data);
        String str = new String(data, 0, nums);
        System.out.println(str);
        fr.close();
    }

    public static void writeFile(String s) throws IOException {
        FileWriter fw = new FileWriter(filename);
        fw.write(s );
        fw.close();
    }

    public static void main(String[] args) throws IOException{
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bis = new BufferedReader(isr);
        String s1 = "";
        StringBuilder s2= new StringBuilder();
        do {
            s1= bis.readLine();
            System.out.println(s1);
            if (s1 ==null){
                break;
            }
            if (s1.length()!=0){
                s1 = s1 +"\r"+"\n";
                s2.append(s1);
            }
        }while (s1.length()!=0);
        writeFile(s2.toString());
        readFile();
    }
}
