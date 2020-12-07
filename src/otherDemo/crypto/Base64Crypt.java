package otherDemo.crypto;

import java.util.Arrays;
import java.util.Base64;

public class Base64Crypt {
    public static String encode(String msg){
        return Base64.getEncoder().encodeToString(msg.getBytes());
    }
    public static String decode(String msg){
        byte[] originBytes = Base64.getDecoder().decode(msg);
        return new String(originBytes,0,originBytes.length);
    }

    public static void main(String[] args) {
       String a = Base64Crypt.encode("nihao");
        System.out.println(a);
        String b = Base64Crypt.decode(a);
        System.out.println(b);
    }
}
