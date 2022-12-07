package demo19_std_IO_objectStream;

import java.io.*;
import java.util.Scanner;

/*《复习》
字节流：
* 字节输出流对象--FileOutputStream(String name,boolean append)
* 字节输入流对象--FileInputStream(String name)
* 字节缓冲输出流对象--BufferedOutputStream(OutputStream out)->BuﬀeredOutputStream(new FileOutputStream(String name))
* 字节缓冲输入流对象--BufferedInputStream(InputStream in)->BuﬀeredOutputStream(new FileInputStream(String name))
字符流：（由于字节流操作中文不是特别的方便，所以Java就提供字符流）
* 编码：它使用指定的编码将得到的字符编码为字节--OutputStreamWriter(OutputStream out,String charset)->OutputStreamWriter(new FileOutputStream(String name))
* 解码：它读取字节，并使用指定的编码将其解码为字符--InputStreamReader(InputStream in,String charset)->InputStreamReader(new FileInputStream(String name))
* 字符（便捷）输出流对象--FileWriter(String name)
* 字符（便捷）输入流对象--FileReader(String name)
* 字符缓冲输出流对象--BufferedWriter(Writer out)->BufferedWriter(new FileWriter(String name))
* 字符缓冲输入流对象--BufferedReader(Reader in)->BufferedReader(new FileReader(String name))
* 字符缓冲流特有方法：BufferedWriter->newLine()
* BufferedReader->readLine()
* */
public class j5_std_in {
    public static void main(String[] args) throws IOException {
        // public static final InputStream in：标准输入流
        // InputStream是字节输入流的抽象基类，in是一个字节流对象
//        InputStream in = System.in;
//        int by;
//        while ((by = in.read()) != -1) {
//            System.out.println((char) by);
//        }


        // 如何能让System.in读取中文时，不会出现乱码（出现编码问题）
        // 如何把字节流转换为字符流？用编码解码（又称转换流）
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);  // InputStream in = System.in;是字节流被转换成（解码）字符流
        // 使用字符流能不能够实现一次读取一行数据呢？可以。但是，一次读取一行数据的方法是字符缓冲输入流的特有方法
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  // 把字符流包装（转换）成字符缓冲输入流

        System.out.println("请输入一个字符串：");
        String line = bufferedReader.readLine();
        System.out.println("你输入的字符串是：" + line);

        System.out.println("请输入一个整数：");
        int i = Integer.parseInt(bufferedReader.readLine());
        System.out.println("你输入的整数是：" + i);

        //自己转换数据类型太麻烦了，所以Java就提供了一个类供我们使用
        Scanner scanner = new Scanner(System.in);
    }
}
