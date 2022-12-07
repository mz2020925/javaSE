package demo18_Char_Stream;

import java.io.*;

public class j8_Copy_javaFile_newLine_readLine {
    public static void main(String[] args) throws IOException {
        // 创建缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charBuffered.java"));
        // 创建缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charBuffered_copy2.java"));

        // 复制文件
        String line;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }


        bufferedReader.close();
        bufferedWriter.close();
    }
}
