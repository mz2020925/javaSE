package demo22_IP_UDP_TCP;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/*
1.创建接收端的Socket对象(DatagramSocket)
2.创建一个数据包对象，用于接收数据
3.调用DatagramSocket对象的receive()方法接收数据
4.解析数据包，并把数据在控制台显示
5.关闭接收端
* */
public class j3_UDP_receive {
    public static void main(String[] args) throws IOException {
        //1.创建接收端的Socket对象
        DatagramSocket socket = new DatagramSocket(10086);

        //2.创建一个数据包对象，用于接收数据
        byte[] bys = new byte[1024];
        // 创建数据包对象
        DatagramPacket packet = new DatagramPacket(bys, bys.length);

        //3.接收数据
        // 把引用packet传过去，receive方法会把接收到地数据存入对象packet中
        socket.receive(packet);

        //4.解析已存入对象packet中数据
        byte[] data = packet.getData();
        int len = data.length;
        String str = new String(data);
        String str2 = new String(data,0,len);
        System.out.println(str);
        System.out.println(str2);

        // 5.
        socket.close();

    }
}
