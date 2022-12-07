package demo17_FileIO_bytesStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class j5_FileOutputStream_Exception {
    public static void main(String[] args) {
        /*之前我们将异常是直接抛出的，现在我们来处理。
        * 异常处理格式：
        * try{
        *   可能出现异常的代码;
        * }catch(异常类名 变量名){
        *   异常的处理代码;
        * }finally{
        *   执行所有清除操作;
        * }
        *
        * 被ﬁnally控制的语句一定会执行，除非JVM退出
        * */
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("myFile\\byteStream.txt",true);
            fos.write("world".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }







    }
}
