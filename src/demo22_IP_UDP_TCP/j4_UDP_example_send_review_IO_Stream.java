package demo22_IP_UDP_TCP;

import javax.sql.DataSource;
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
public class j4_UDP_example_send_review_IO_Stream {
    public static void main(String[] args) throws IOException {
        //1.创建发送端的Socket对象(DatagramSocket)
        DatagramSocket socket = new DatagramSocket();

        /*《复习》
        字节流：
        * 字节输出流对象--FileOutputStream(String name,boolean append)
        * 字节输入流对象--FileInputStream(String name)
        * 字节缓冲输出流对象--BufferedOutputStream(OutputStream out)->BuﬀeredOutputStream(new FileOutputStream(String name))
        * 字节缓冲输入流对象--BufferedInputStream(InputStream in)->BuﬀeredOutputStream(new FileInputStream(String name))
        字符流：（由于字节流操作中文不是特别的方便，所以Java就提供字符流）
        * 编码：它使用指定的编码将得到的字符编码为字节--OutputStreamWriter(OutputStream out,String charset)->OutputStreamWriter(new FileOutputStream(String name))
        * 解码：它读取字节，并使用指定的编码将其解码为字符--InputStreamReader(InputStream in,String charset)->InputStreamReader(new FileInputStream(String name))
        * 字符输出流对象--FileWriter(String name)
        * 字符输入流对象--FileReader(String name)
        * 字符缓冲输出流对象--BufferedWriter(Writer out)->BufferedWriter(new FileWriter(String name))
        * 字符缓冲输入流对象--BufferedReader(Reader in)->BufferedReader(new FileReader(String name))
        * 字符缓冲流特有方法：BufferedWriter->newLine()
        * BufferedReader->readLine()
        * */
        // 2.自己封装键盘录入数据并封装
        // 字符缓冲输入流对象(解码对象(编码对象(字符)))
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=bufferedReader.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            //3.创建数据包对象，并把数据存入数据包对象，存入的数据必须是字节型的对象
            byte[] bys = line.getBytes();
            DatagramPacket packet = new DatagramPacket(bys, bys.length, InetAddress.getByName("211.83.104.118"), 10086);
            //4.调用DatagramSocket对象的方法发送数据
            socket.send(packet);
            //输入的数据是886，发送完886数据结束

        }
        //5.关闭发送端
        socket.close();
    }
}
