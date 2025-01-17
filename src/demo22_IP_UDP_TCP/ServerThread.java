package demo22_IP_UDP_TCP;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket socket;

    public ServerThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        /*
        * 接收数据写到文件
        *
        * */
        try {
            // 创建送水管道
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile/server6.txt"));
            // 解决服务器上面只有一个文件的问题，每个用户上传到服务器的文件存储时设置为不同名字。
            int count=0;
            File file = new File("myFile/server6-[" + count + "].txt");
            while (file.exists()){
                count++;
                file = new File("myFile/server6-[" + count + "].txt");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            //
            String line;
            while ((line=bufferedReader.readLine())!=null){// 开始接水
                //开始存入服务端文件
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            // 服务器给出反馈，创建送水管道并送水
            BufferedWriter bufferedWriter1 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter1.write("文件上传成功");
            bufferedWriter1.newLine();
            bufferedWriter1.flush();

            socket.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
