package demo22_IP_UDP_TCP;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
案例需求
    客户端：数据来自于文本文件，接收服务器反馈
    服务器：接收到的数据写入文本文件，给出反馈
案例分析
    创建客户端对象，创建输入流对象指向文件，每读入一行数据就给服务器输出一行数据，输出结束后使
    用shutdownOutput()方法告知服务端传输结束
    创建服务器对象，创建输出流对象指向文件，每接受一行数据就使用输出流输出到文件中，传输结束
    后。使用输出流给客户端反馈信息
    客户端接受服务端的回馈信息
* */
public class j10_TCP_server5 {
    public static void main(String[] args) throws IOException {
        // 创建送水接水机
        ServerSocket serverSocket = new ServerSocket(10086);

        //通过监听数据是否送达到这里，一旦送达就创建对象Socket
        Socket accept = serverSocket.accept();

        // 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile/server4.txt"));
        // 创建接水管道对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        while ((line=bufferedReader.readLine())!=null){
//            if ("886".equals(line)){
//                break;
//            }
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(line+"已写入");
        }

        // 给客户端反馈,为什么另外定义bufferedWriter1呢，因为上面的bufferedWriter是对应着myFile/server4.txt
        BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter1.write("文件上传成功");
        bufferedWriter1.newLine();
        bufferedWriter1.flush();
        // 有没有发现，服务端是先收再发，客户端是先发再收

        bufferedWriter.close();
        serverSocket.close();
    }
}
