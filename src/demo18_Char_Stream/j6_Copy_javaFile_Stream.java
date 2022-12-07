package demo18_Char_Stream;

import java.io.*;

public class j6_Copy_javaFile_Stream {
    public static void main(String[] args) throws IOException {
        //根据数据源创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charBuffered.java"));
        //根据目的地创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charBuffered_copy.java"));

        //方式一：一次读取一个字符
        int ch;
        while ((ch=bufferedReader.read())!=-1){
            bufferedWriter.write(ch);
        }

        //方式二：一次读取一个字符数组
        char[] chs = new char[1024];
        int len;
        while ((len=bufferedReader.read(chs))!=-1){
            bufferedWriter.write(chs,0,len);
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
