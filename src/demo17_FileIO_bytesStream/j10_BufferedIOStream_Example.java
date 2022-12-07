package demo17_FileIO_bytesStream;

import java.io.*;

public class j10_BufferedIOStream_Example {
    public static void main(String[] args) throws IOException{
        /*
        字节缓冲流复制视频
        */
        long startTime = System.currentTimeMillis();
        method4();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime-startTime)+"ms");


    }

    // method4() -- 字节缓冲流一次读写一个字节数组
    public static void method4() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myFile2\\1_copy.mp4"));

        // 字节缓冲流一次读、写一个字节数组
        byte[] bys = new byte[1024];
        int len;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bos.close();
        bis.close();
    }

    // method3() -- 字节缓冲流一次读写一个字节数组
    public static void method3() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile\\1.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("myFile2\\1_copy.mp4"));

        // 字节缓冲流一次读、写一个字节
        int by;
        while ((by=bis.read())!=-1){
            bos.write(by);
        }
        bos.close();
        bis.close();
    }

    // method2() -- 基本字节流一次读写一个字节数组
    public static void method2() throws IOException{
        FileInputStream fis = new FileInputStream("myFile\\1.mp4");
        FileOutputStream fos = new FileOutputStream("myFile2\\1_copy.mp4");

        byte[] bys = new byte[1024];
        int len;
        while ((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }

    // method2() -- 基本字节流一次读写一个字节
    public static void method1() throws IOException{
        FileInputStream fis = new FileInputStream("myFile\\1.mp4");
        FileOutputStream fos = new FileOutputStream("myFile2\\1_copy.mp4");

        int by;
        while ((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }



}
