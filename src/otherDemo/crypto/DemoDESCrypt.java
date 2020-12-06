package otherDemo.crypto;


import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class DemoDESCrypt {

    //测试des加密
    public static void main(String[] args) {
      //准备key和data
        String key = "20201206";  //8个字符
        String data = "这个世界从来没有绝对的公平,你的权力和和自由都需要靠自己的努力去争取!";
        System.out.println(data);
        //传入data和key的字节数组
        byte[] cryptBytes = DES.encrypto(data.getBytes(),key.getBytes());
        //将cryptBytes转换为字符串
        String cryptText = null;
        if (cryptBytes != null) {
            cryptText = new String(cryptBytes,0,cryptBytes.length);
        }
        System.out.println("DES加密后:   "   );
        System.out.println(cryptText );

        byte[] originBytes = DES.decrypto(cryptBytes, key.getBytes());
        String originText = null;
       if (originBytes!=null){
           originText = new String(originBytes,0,originBytes.length);
       }
        System.out.println("DES解密后:    \n"+originText);


    }
}
class DES{
    /**
     * 对称加密算法（DES）java代码实现
     */
    /**
     * 1、des三要素：data key mode
     * 2、java中使用给定的api DESKeySpec SecretKeyFactory SecretKey Cipher
     *
     */
    public static byte[] encrypto(byte[] data,byte[] key){
        try {
            //1、通过传入的key new new一个des加密的钥匙对象
            DESKeySpec desKeySpec =new DESKeySpec(key);
            //2、通过工厂类SecretKeyFactory生成一个 DES加密工厂 secretKeyFactory
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //3、通过secretKeyFactory生成一个key为desKeySpec的钥匙
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            //4、选择加密模式 :①new一个cipher cipher初始化为encrypt模式，②cipher.doFinal方法加密数据源,返回加密后的字段
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            return cipher.doFinal(data) ;
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }
    //解密步骤与加密相似,最后的cipher.init初始化的模式为decrypt就是des解密啦
    public static byte[] decrypto(byte[] data,byte[] key){
        try {
            //1、通过传入的key new new一个des加密的钥匙对象
            DESKeySpec desKeySpec =new DESKeySpec(key);
            //2、通过工厂类SecretKeyFactory生成一个 DES加密工厂 secretKeyFactory
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //3、通过secretKeyFactory生成一个key为desKeySpec的钥匙
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            //4、选择加密模式 :①new一个cipher cipher初始化为encrypt模式，②cipher.doFinal方法加密数据源,返回加密后的字段
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            return cipher.doFinal(data) ;
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }
    //写一个兼容加密和解密的方法
    public static byte[] DESOperation(byte[] data,byte[] key,String mode){
        try {
            //1、通过传入的key new new一个des加密的钥匙对象
            DESKeySpec desKeySpec =new DESKeySpec(key);
            //2、通过工厂类SecretKeyFactory生成一个 DES加密工厂 secretKeyFactory
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
            //3、通过secretKeyFactory生成一个key为desKeySpec的钥匙
            SecretKey secretKey = secretKeyFactory.generateSecret(desKeySpec);
            //4、选择加密模式 :①new一个cipher cipher初始化为encrypt模式，②cipher.doFinal方法加密数据源,返回加密后的字段
            Cipher cipher = Cipher.getInstance("DES");
            //5、判断加密模式（传入mode是decrypt还是encrypt）
            if (mode.equalsIgnoreCase("decrypt") ){
                cipher.init(Cipher.DECRYPT_MODE,secretKey);
            }else if (mode.equalsIgnoreCase("encrypt")){
                cipher.init(Cipher.ENCRYPT_MODE,secretKey);
            }else {
                return null;
            }
            return cipher.doFinal(data) ;
        } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | NoSuchPaddingException | BadPaddingException | IllegalBlockSizeException e) {
            e.printStackTrace();
        }
        return null;
    }
}
