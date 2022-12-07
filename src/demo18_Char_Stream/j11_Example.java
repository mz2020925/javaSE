package demo18_Char_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class j11_Example {
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

        bufferedReader.close();

        Random random = new Random();
        int i = random.nextInt(stringArrayList.size());

        String s = stringArrayList.get(i);

        System.out.println(s);


    }
}
