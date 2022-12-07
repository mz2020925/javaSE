package demo22_IP_UDP_TCP;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class j5_TCP_receive {
    public static void main(String[] args) throws IOException {
        // 1.创建服务端的Socket对象(Socket)
        ServerSocket serverSocket = new ServerSocket(10086);

        // 2.接收数据--如何接收数据呢？
        // 需要用到输入流，但是serverSocket没有输入流的方法
        // 需要通过serverSocket.accept()获取Socket对象--accept，这个对象有输入流的方法
        // 通过accept.getInputStream()获取InputStream对象，再利用InputStream对象的read方法将自己体内的数据存入
        // bys数组中。
        Socket accept = serverSocket.accept();  // 接水管道阀门对象
        InputStream acceptInputStream = accept.getInputStream();  // 接水管道对象
        byte[] bys = new byte[1024];
        int len = acceptInputStream.read(bys);  // 接水管道对象开始接水
        String str = new String(bys, 0, len);
        System.out.println(str);

        //3.关闭机器
        acceptInputStream.close();
        serverSocket.close();
    }
}
