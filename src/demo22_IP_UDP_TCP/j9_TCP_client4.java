package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.Socket;

/*
案例需求
    客户端：数据来自于文本文件
    服务器：接收到的数据写入文本文件
案例分析
    创建客户端，创建输入流对象指向文件，从文件循环读取数据，每读取一行就使用输出流给服务器输出
    一行
    创建服务端，创建输出流对象指向文件，从客户端接受数据，每接受一行就给文件中输出一行
* */
public class j9_TCP_client4 {
    public static void main(String[] args) throws IOException {
        // “送水接水机”
        Socket socket = new Socket("211.83.104.118", 10086);
        // 创建送水管道对象,流的方向是从外向内（从字符变为字节）,
        // 注意这里用到缓冲字符输出流，如果是图片就不行了。
        // 前面我们没有使用缓冲流的时候，用socket.getOutputStream()是传一个具体长度的字符对应的字节，
        // 用accept.getInputStream()是用一个具体长度的byte[]型数组来接收数据--用了缓冲流之后，就不用创建数组这么麻烦了
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        // 创建字符缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile/client4.txt"));
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(line+"已发送");
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
