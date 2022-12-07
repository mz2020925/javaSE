package demo18_Char_Stream;

import java.io.*;

public class j7_newLine_readLine{
    public static void main(String[] args) throws IOException {
        /*
        * newLine() -- 写行分隔符，行分隔符字符串由系统属性定义
        * readLine() -- 读一行文字。  结果包含一行的内容的字符串，不包括任何行终止字符(换行符)，需要配合newLine()才能实现复制。
        * 如果流的结尾已经到达，则为null.
        * */
        // 创建缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charStream.txt",true));
        for (int i = 0; i < 10; i++) {
            bufferedWriter.write("hello"+i);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();

        // 创建缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charStream.txt"));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
