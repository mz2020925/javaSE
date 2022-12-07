package demo18_Char_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class j10_FileToCollection {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charStream.txt"));

        // 创建集合
        ArrayList<String> stringArrayList = new ArrayList<>();

        //从文件写入集合
        String line;
        while ((line=bufferedReader.readLine())!=null){
            stringArrayList.add(line);
        }

        // 打印集合
        for (String s : stringArrayList) {
            System.out.println(s);
        }

        bufferedReader.close();
    }
}
