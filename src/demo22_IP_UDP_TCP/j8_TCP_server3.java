package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.ServerSocket;
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
public class j8_TCP_server3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);

        Socket accept = serverSocket.accept();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile/server3.txt"));
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
