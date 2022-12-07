package demo22_IP_UDP_TCP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class j11_TCP_server6 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);


        while (true){
            // 监听客户端发送数据到达这里（或者说客户端的socket对象请求创建一个socket连接）时,就创建一个服务端的socket对象
            Socket accept = serverSocket.accept();
            // 将来我们要写一个类，这个类要实现Runnable接口，这个类的参数是Socket对象
            new Thread(new ServerThread(accept)).start();

        }
        //serverSocket.close();
    }
}
