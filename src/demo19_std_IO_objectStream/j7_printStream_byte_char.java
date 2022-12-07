package demo19_std_IO_objectStream;
/*
打印流分类：
    字节打印流：PrintStream
    字符打印流：PrintWriter
打印流的特点：
    只负责输出数据，不负责读取数据
    永远不会抛出IOException
    有自己的特有方法
*
* */


import java.io.*;

public class j7_printStream_byte_char {
    public static void main(String[] args) {
        /*
        字节打印流：
            PrintStream(String ﬁleName)：使用指定的文件名创建新的打印流
            使用继承父类的方法写数据，查看的时候会转码；使用自己的特有方法写数据，查看的数据原样输出
            可以改变输出语句的目的地
        * */
        try (PrintStream printStream = new PrintStream("myFile2/printStream.txt")) {
            // 方式一：使用父类方法write()写数据 -- 一次写一个字节,会自动解码，文件中写入的是字母 “a”
            byte[] bytes = {98, 80, 81, 89, 90};
            printStream.write(bytes, 0, 2);  // bP
            printStream.write(97);  // a
            printStream.write("-".getBytes());  // -

            // 使用自己特有方法写数据 -- 不会解码，文件中写的就是 97
            printStream.println(97);
            printStream.print(98);


        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        字符打印流：
            PrintWriter的父类是Writer--Writer是字符输出流
        * */
        // 构造方法一：PrintWriter(String fileName) ：使用指定的文件名创建一个新的PrintWriter，而不需要自动执行行刷新
        // 标准情况下，PrintWriter()要传递的是new FileWriter("myFile2/printStream.txt")对象，但是可以省略new FileWriter，
        // 直接传文件路径，它会自动创建new FileWriter，但不建议这样
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("myFile2/printStream.txt",true))) {
            printWriter.write("\r\n");
            printWriter.write("hello");
            printWriter.write("\r\n");
            printWriter.flush();
            printWriter.write("world");
            printWriter.write("\r\n");
            printWriter.flush();

            printWriter.println("hello");
            printWriter.flush();
            printWriter.println("world");
            printWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
        // 构造方法二：PrintWriter(Writer out, boolean autoFlush)：创建一个新的PrintWriter
        try (PrintWriter printWriter = new PrintWriter(new FileWriter("myFile2/printStream.txt",true),true)) {
            // 写入、换行、刷新
            printWriter.println("java");
            printWriter.println("python");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
