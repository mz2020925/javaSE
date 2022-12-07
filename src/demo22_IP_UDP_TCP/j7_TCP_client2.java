package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.Socket;

/*
案例需求
    客户端：数据来自于键盘录入, 直到输入的数据是886，发送数据结束
    服务端：接收到数据在控制台输出
案例分析
    客户端创建对象，使用键盘录入循环接受数据，接受一行发送一行，直到键盘录入886为止
    服务端创建对象，使用输入流按行循环接受数据，直到接受到null为止
* */
public class j7_TCP_client2 {
    public static void main(String[] args) throws IOException {
        // 创建“送水接水机”对象
        Socket socket = new Socket("211.83.104.118",10086);

        //new BufferedReader是字符缓冲输入流对象，new InputStreamReader是解码对象,System.in会返回字节流,可以看出流的方向是从内向外
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //new BufferedWriter是字符缓冲输出流对象，new OutputStreamWriter是编码对象，在下面bufferedWriter.write(line)传进来一个字符串，
        //通过new BufferedWriter把字符串传给new OutputStreamWriter，然后new OutputStreamWriter把字符编码成字节，传给socket.getOutputStream()，
        //最后socket.getOutputStream()得到的还是字节，和socketOutputStream.write(line.getBytes())本质上一样,可以看出流的方向是从外向内
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 从键盘输入数据，然后发送给服务器
        String line;
        while ((line = bufferedReader.readLine())!=null){
            if ("886".equals(line)){
                break;
            }
            // 获取送水管道对象，并开始送水
            //OutputStream socketOutputStream = socket.getOutputStream();
            //socketOutputStream.write(line.getBytes());
            // socketOutputStream是一个字节输出流，是不是缓冲流不知道，这样写太麻烦，上面创建BufferedWriter是简便写法
            // 下面开始送水，送水管道对象变成bufferedWriter，方法变成write(line)、newLine()、flush()
            bufferedWriter.write(line);  // 因为是BufferedWriter字符输出缓冲流对象,可以直接操作字符,不用再line.getBytes()转换成字节了
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        socket.close();
    }
}
