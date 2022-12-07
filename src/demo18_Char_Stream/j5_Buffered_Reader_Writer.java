package demo18_Char_Stream;

import java.io.*;

public class j5_Buffered_Reader_Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("myFile2/charStream.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("hello\n");
        bufferedWriter.write("world");
        bufferedWriter.close();

        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("myFile2/charStream.txt")));
        // 上面那种方式太复杂，使用下面这种方式
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charStream.txt"));
        // 读取方式一,一次读取一个字符数据
        int ch;
        while ((ch=bufferedReader.read())!=-1){
            System.out.println((char) ch);
//            System.out.print((char) ch);
//            System.out.println(ch + " " + (char) ch);
        }

        // 读取方式二,一次读取一个字符数组数据
//        char[] chs = new char[1024];
//        int len;
//        while ((len=bufferedReader.read(chs))!=-1){
//            System.out.println(new String(chs,0,len));
//        }
        bufferedReader.close();

    }
}
