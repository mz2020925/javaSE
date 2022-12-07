package demo22_IP_UDP_TCP;


import java.io.IOException;
import java.net.*;

/*
1.创建发送端的Socket对象(DatagramSocket)
2.创建数据，并把数据打包
3.调用DatagramSocket对象的方法发送数据
4.关闭发送端
* */
public class j2_UDP_send {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socket对象(DatagramSocket)
        // DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口
        DatagramSocket ds = new DatagramSocket();

        //2.创建数据，并把数据打包
        byte[] bys = "hello,world".getBytes();
        int len = bys.length;
        InetAddress address = InetAddress.getByName("211.83.104.118");  // 根据IP地址创建了对象
        int port = 10086; // 端口号范围：0~65535，我们通常使用1024~65535；
        // 创建数据包对象
        DatagramPacket dp = new DatagramPacket(bys, len, address, port);
        // 更简单地创建数据包对象
        //DatagramPacket dp1 = new DatagramPacket(bys, bys.length, InetAddress.getByName("211.83.104.118"), 10086);

        //3.调用Socket对象的send()方法发送数据
        ds.send(dp);

        //4.关闭Socket对象
        ds.close();




    }
}
