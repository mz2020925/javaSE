package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.Socket;

/*
案例需求
    客户端：数据来自于键盘录入，直到输入的数据是886,发送数据结束
    服务端：接受到的数据写入文本文件中

案例分析
    客户端创建对象，使用键盘录入循环接受数据，接受一行发送一行，直到键盘录入886为止
    服务端创建对象，创建输出流对象指向文件，每接受一行数据后使用输出流输出到文件中，直到接受到
    null为止
* */
public class j8_TCP_client3 {
    public static void main(String[] args) throws IOException {
        // 创建“送水接水机”
        Socket socket = new Socket("211.83.104.118",10086);

        // 创建送水管道对象,流的方向是从外向内（从字符变为字节）
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=bufferedReader.readLine())!=null){  // 说起来为什么就用是否等于null判断呢？
            if ("886".equals(line)){
                break;
            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        socket.close();
    }
}
