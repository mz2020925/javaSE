package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.ServerSocket;
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
public class j9_TCP_server4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        Socket accept = serverSocket.accept();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile/server4.txt"));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(line+"已写入");
        }


        bufferedWriter.close();
        serverSocket.close();
    }
}
