package demo22_IP_UDP_TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
* */
public class j4_UDP_example_receive {
    public static void main(String[] args) throws IOException {
        //1.创建接收端的Socket对象(DatagramSocket),创建接收端的socket对象必须提供端口号，而创建发送端的socket则不用
        DatagramSocket socket = new DatagramSocket(10086);

        while (true) {
            //2.创建数据包对象，用于存放接收到的数据
            byte[] bytes = new byte[1024];
            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

            //3.接收数据
            socket.receive(packet);
            String recData = new String(packet.getData(), 0, packet.getLength());
            System.out.println(recData);
//            if ("886".equals(recData)){
//                break;
//            }
        }
        //5.关闭接收端
//        socket.close();
    }
}
