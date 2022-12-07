package demo18_Char_Stream;

import java.io.*;
import java.util.ArrayList;

public class j9_CollectionToFile {
    public static void main(String[] args) throws IOException {
        // 创建集合并添加元素
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("hello");
        stringArrayList.add("java");
        stringArrayList.add("python");
        stringArrayList.add("cpp");

        // 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charStream.txt"));

        // 将集合写入文件
        for (String s : stringArrayList) {
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        // 释放资源
        bufferedWriter.close();
    }
}
