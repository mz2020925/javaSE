package demo18_Char_Stream;

import java.io.*;

public class j3_writer_flush_close_read {
    public static void main(String[] args) throws IOException {
        /*
         * flush() -- 刷新流，之后还可以继续写数据
         * close() -- 关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
         *
         * */
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile\\byteStream.txt", true), "UTF-8");
        osw.write(97);
        osw.write("a");
        osw.write("abcde");
        char[] chs = {'a', 'b', 'c', 'd', 'e'};
        osw.write(chs, 0, chs.length);
        osw.close();

        InputStreamReader isr = new InputStreamReader(new FileInputStream("myFile\\byteStream.txt"), "UTF-8");
        //int read()：一次读一个字符数据
        //int ch;
        //while ((ch=isr.read())!=-1) {
        //  System.out.print((char)ch);
        //}
        //int read(char[] cbuf)：一次读一个字符数组数据
        char[] chs2 = new char[1024];
        int len;
        while ((len = isr.read(chs2)) != -1) {
            System.out.print(new String(chs2, 0, len));
        }
        //释放资源
        isr.close();


    }
}
