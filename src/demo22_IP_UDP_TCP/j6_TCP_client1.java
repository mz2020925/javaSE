package demo22_IP_UDP_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
public class j6_TCP_client1 {
    public static void main(String[] args) throws IOException {
        // 创建客户端Socket对象
        Socket socket = new Socket("127.0.0.1", 10086);
        // 获取送水管道对象,并开始送水
        OutputStream socketOutputStream = socket.getOutputStream();
        socketOutputStream.write("hello,服务器,听得到吗?".getBytes());

        // 获取接水管道对象,并开始接水
        InputStream socketInputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = socketInputStream.read(bytes);
        String strData = new String(bytes, 0, len);
        System.out.println("客户端接水："+strData);

        socket.close();
    }
}
