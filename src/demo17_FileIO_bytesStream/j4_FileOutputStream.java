package demo17_FileIO_bytesStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class j4_FileOutputStream {
    public static void main(String[] args) throws IOException {
        /* 一、字节流写数据基本方式
         * 做了三件事情：
         * 1.调用系统功能创建了文件
         * 2.创建了 文件类字节输出流 对象
         * 3.让字节输出流对象指向创建好的文件--就是在创建对象的时候传的参数
         * */
        File fileMkdir = new File("myFile");
        System.out.println("fileMkdir.mkdir() = " + fileMkdir.mkdir());
        //FileOutputStream(String name)：创建 文件类字节输出流 并将输出流输出到指定的名称的文件
        FileOutputStream fos1 = new FileOutputStream("myFile\\fos.txt");
        // 将指定的字符写入此文件输出流
        fos1.write(98);  // 这里看来，98是数字，不是字符，规定写入数字时是把它认为是ASIIC码
        fos1.write("97".getBytes());  // 要想写入数字怎么办，不许写入”字符型的数字“
        fos1.write(96);
        System.out.println("97".getBytes());  // 字节数据到底是什么样
        System.out.println(Arrays.toString("97".getBytes()));
        // 关闭此文件输出流并释放与此流相关联的任何系统资源
        fos1.close();


        /*二、字节流写数据的三钟方式
         * void write(byte b)--将指定的字节写入此文件输出流  一次写一个字节数据
         * void write(byte[] b)--将 b.length字节从指定的字节数组写入此文件输出流  一次写一个字节数组数据
         * void write(byte[] b, int off, int len)--将 len字节从指定的字节数组开始，从偏移量oﬀ开始写入此文件输出流一次写一个字节数组的部分数据
         * */
        FileOutputStream fos2 = new FileOutputStream(new File("myFile\\byteStream.txt"));
        fos2.write(97);
        byte[] bys = {97, 98, 99, 100, 101, 102};
        fos2.write(bys);
        byte[] bys2 = "abcde".getBytes();
        fos2.write(bys2);
        fos2.write(bys, 0, bys.length - 1);
        fos2.close();


        /*三、写数据的两个小问题
         * 1.字节流写数据如何实现换行：
         *      windows:\r\n、linux:\n、mac:\r
         * 2.字节流写数据如何实现close之后第二次开启输出流，可以实现追加写入
         *      public FileOutputStream(String name,boolean append)--第二个参数设为true
         * */
        FileOutputStream fos3 = new FileOutputStream("myFile\\byteStream.txt",true);
        for (int i = 0; i < 10; i++) {
            fos3.write("hello".getBytes());
            fos3.write("\r\n".getBytes());
        }
        fos3.close();
    }
}
