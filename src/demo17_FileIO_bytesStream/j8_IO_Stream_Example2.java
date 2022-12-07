package demo17_FileIO_bytesStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class j8_IO_Stream_Example2 {
    public static void main(String[] args) throws IOException {
        // 实现图片的复制
        FileInputStream fis = new FileInputStream("myFile\\0.jpg");
        FileOutputStream fos = new FileOutputStream("myFile2\\0_copy.jpg");
        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1) {
            fos.write(bys,0,len);
            // System.out.println(new String(bys, 0, len));
        }
        fos.close();
        fis.close();


    }
}
