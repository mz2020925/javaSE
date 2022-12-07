package demo22_IP_UDP_TCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class j5_TCP_send {
    public static void main(String[] args) throws IOException {
        // 1.创建客户端的Socket对象(Socket)
        // 方式1：Socket(InetAddress address, int port)--构造方法
        // static InetAddress getByName(String host)--此方法就类似于创建了一个对象，这个对象是主机
        //Socket socket = new Socket(InetAddress.getByName("211.83.104.118"), 10086);
        // 方式1：Socket(String host, int port)--构造方法，给参数String host会在底层自动调用InetAddress.getByName("211.83.104.118")
        Socket socket = new Socket("211.83.104.118", 10086);

        //2.发送数据
        // 把socket比作一台“送水接水机”，调用此方法就是为了获取这台机器的送水管道对象，并且把这台机器的送水地址给到管道
        OutputStream socketOutputStream = socket.getOutputStream();  // 送水管道对象
        //通过 送水管道对象 把水送出去，上面socket.getOutputStream()时已经把地址告诉对象socketOutputStream了
        socketOutputStream.write("hello,world,哈哈哈".getBytes());  // 送水管道对象开始送水

        //3.关闭机器
        socket.close();
    }
}
