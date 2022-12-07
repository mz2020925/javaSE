package demo22_IP_UDP_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
案例需求
    客户端：发送数据，接受服务器反馈
    服务器：收到消息后给出反馈
案例分析
    客户端创建对象，使用输出流输出数据
    服务端创建对象，使用输入流接受数据
    服务端使用输出流给出反馈数据
    客户端使用输入流接受反馈数据
* */
public class j6_TCP_server1 {
    public static void main(String[] args) throws IOException {
        // 创建服务器端的Socket对象(ServerSocket)
        ServerSocket serverSocket = new ServerSocket(10086);
        // 侦听要连接到此套接字并接受它
        Socket accept = serverSocket.accept();

        // 获取接水管道对象，开始接水
        InputStream acceptInputStream = accept.getInputStream();
        byte[] bytes = new byte[1024];
        int len = acceptInputStream.read(bytes);
        String strData = new String(bytes, 0, len);
        System.out.println("服务器接水:"+strData);

        // 获取送水管道对象，开始送水
        OutputStream acceptOutputStream = accept.getOutputStream();
        acceptOutputStream.write("hello,客户端,听得到吗?".getBytes());
        serverSocket.close();

    }
}
