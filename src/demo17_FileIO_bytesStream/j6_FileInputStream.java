package demo17_FileIO_bytesStream;

import java.io.FileInputStream;
import java.io.IOException;

public class j6_FileInputStream {
    public static void main(String[] args) {
        /*字节输入流读取数据的步骤:
            创建字节输入流对象
            调用字节输入流对象的读数据方法
            释放资源
        */

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("myFile\\byteStream.txt");
            int by;
            while ((by = fis.read()) != -1) {
                System.out.println(by);
                System.out.println((char)by);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }

        }


    }
}
