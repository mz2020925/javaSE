package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
案例需求
    客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
    服务端：接收到数据在控制台输出
案例分析
    客户端创建对象，使用键盘录入循环接受数据，接受一行发送一行，直到键盘录入886为止
    服务端创建对象，使用输入流按行循环接受数据，直到接受到null为止
* */
public class j7_TCP_server2 {
    public static void main(String[] args) throws IOException {
        // 创建“送水接水机”对象
        ServerSocket serverSocket = new ServerSocket(10086);

        Socket accept = serverSocket.accept();//serverSocket.accept()等待数据送达到服务端，就在这里创建一个Socket对象

        //获取接水管道对象
        //InputStream acceptInputStream = accept.getInputStream();
        //这是字节流，是不是缓冲流不知道，这样写太麻烦，下面创建BufferedWriter是简便写法
        //获取接水管道对象
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        String line;
        // 下面开始接水，接水管道对象变成bufferedReader，方法变成readLine()
        while ((line=bufferedReader.readLine())!=null){
            // 我在客户端输入886回车后，服务端也会关闭，这是为什么?我猜可能再客户端关闭的时候会发送一个文件结束符就是null,
            // 但是我把serverSocket.close();注释掉，客户端关闭后，服务端也会关闭，
            // 但是，我把while循环注释掉，就是 接水管道对象 不接收水(数据)，客户端关闭，服务端不会关闭
            System.out.println(line);
        }

//        serverSocket.close();
    }
}
