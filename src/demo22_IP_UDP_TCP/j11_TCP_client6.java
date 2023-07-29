package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class j11_TCP_client6 {
    public static void main(String[] args) throws IOException {
        // “送水接水机”
        Socket socket = new Socket("113.54.220.147", 10086);
        // 创建送水管道对象,流的方向是从外向内（从字符变为字节）,
        // 注意这里用到缓冲字符输出流，如果是图片就不行了。
        // 前面我们没有使用缓冲流的时候，用socket.getOutputStream()是传一个具体长度的字符对应的字节，
        // 用accept.getInputStream()是用一个具体长度的byte[]型数组来接收数据--用了缓冲流之后，就不用创建数组这么麻烦了
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        // 创建字符缓冲输入流
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile/client6.txt"));
        while ((line=bufferedReader.readLine())!=null){// 读取客户端文件数据
            // 开始向服务器送水
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            System.out.println(line+"已发送");
        }

        // 自定义文件发送完毕的标记,定义结束标记的目的是因为程序会一直处于等待状态，造成这个问题的原因是服务端接收数据的方式是阻塞式的
        // 但是这么做的弊端就是当文件中含有886这个字符时，文件上传就会终止再886字符这里
        // 因此，我们换一种做法--调用方法socket.shutdownOutput();
        // bufferedWriter.write("886");
        // bufferedWriter.newLine();
        // bufferedWriter.flush();
        socket.shutdownOutput();

        // 接收反馈
        BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line1 = bufferedReader1.readLine(); // 等待读取服务器反馈的数据
        System.out.println("服务器的反馈内容:"+line1);

        bufferedReader.close();
        bufferedWriter.close();
    }
}
