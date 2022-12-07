package demo18_Char_Stream;

import java.io.*;
/*《复习》
字节流：
* 字节输出流对象--FileOutputStream(String name,boolean append)
* 字节输入流对象--FileInputStream(String name)
* 字节缓冲输出流对象--BufferedOutputStream(OutputStream out)->BuﬀeredOutputStream(new FileOutputStream(String name))
* 字节缓冲输入流对象--BufferedInputStream(InputStream in)->BuﬀeredOutputStream(new FileInputStream(String name))
字符流：（由于字节流操作中文不是特别的方便，所以Java就提供字符流）
* 编码：它使用指定的编码将得到的字符编码为字节--OutputStreamWriter(OutputStream out,String charset)->OutputStreamWriter(new FileOutputStream(String name))
* 解码：它读取字节，并使用指定的编码将其解码为字符--InputStreamReader(InputStream in,String charset)->InputStreamReader(new FileInputStream(String name))
* 字符输出流对象--FileWriter(String name)
* 字符输入流对象--FileReader(String name)
* 字符缓冲输出流对象--BufferedWriter(Writer out)->BufferedWriter(new FileWriter(String name))
* 字符缓冲输入流对象--BufferedReader(Reader in)->BufferedReader(new FileReader(String name))
* 字符缓冲流特有方法：BufferedWriter->newLine()
* BufferedReader->readLine()
* */
public class j4_Copy_javaFile {
    public static void main(String[] args) throws IOException {
        // 根据数据源创建字符输入流对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("j3_writer_flush_close_reader.java"));
        //根据目的地创建字符输出流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile\\Copy.java"));

        char[] chs = new char[1024];
        int len;
        while ((len = isr.read()) != -1) {
            osw.write(chs, 0, len);
        }
        osw.close();
        isr.close();


        // 方法二：改进版
        /*
        * 使用FileReader（它是InputStreamReader的子类，读取字符文件的便捷类）代替InputStreamReader
        *
        * 使用FileWriter（它是OutputStreamWriter的子类，写入字符文件的便捷类）代替OutputStreamWriter
        *
        * 但是，如果存在字符流的编码问题，还得使用InputStreamReader、OutputStreamWriter，因为
        * FileReader、FileWriter没有charName参数。
        *
        * 被复制的文件-->读数据-->Reader(抽象类)-->InputStreamReader(用起来太麻烦)-->FileReader(编写类)
        * 被复制的文件-->读数据-->Writer(抽象类)-->OutputStreamWriter(用起来太麻烦)-->FileWriter(编写类)
        * */
        FileReader fr = new FileReader("j3_writer_flush_close_reader.java");
        FileWriter fw = new FileWriter("myFile\\Copy.java");

        char[] chs2 = new char[1024];
        int len2;
        while ((len2=fr.read())!=-1){
            fw.write(chs2,0,len2);
        }
        fw.close();
        fr.close();

    }
}
