package demo17_FileIO_bytesStream;

import java.io.*;

public class j9_BufferedIOStream {
    public static void main(String[] args) throws IOException {
        /*
        字节缓冲输出流：BufferedOutputStream(OutputStream out)
        */
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myFile\\byteStream.txt"));
        // 写数据
        bos.write("world\r\n".getBytes());
        bos.write("红火火恍恍惚惚\r\n".getBytes());
        // 释放资源
        bos.close();

        /*
        字节缓冲输入流：BufferedInputStream(InputStream in)
        */
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile\\byteStream.txt"));
        // 一次读取一个字节数组数据
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            System.out.println(bys);  // 如果打印bys的话，就是打印了一个指向byte类型的数组的引用
            System.out.println(new String(bys,0,len));
        }
        // 释放资源
        bis.close();

    }
}
