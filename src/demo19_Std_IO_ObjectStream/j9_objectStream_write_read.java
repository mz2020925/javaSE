package demo19_Std_IO_ObjectStream;
/*《复习》
字节流：
* 字节输出流抽象类 -- OutputStream
* 字节输入流抽象类 -- InputStream
* 字节输出流对象--FileOutputStream(String name,boolean append)
* 字节输入流对象--FileInputStream(String name)
* 字节缓冲输出流对象--BufferedOutputStream(OutputStream out)->BuﬀeredOutputStream(new FileOutputStream(String name))
* 字节缓冲输入流对象--BufferedInputStream(InputStream in)->BuﬀeredOutputStream(new FileInputStream(String name))

字符流：（由于字节流操作中文不是特别的方便，所以Java就提供字符流）
* 字符输出流抽象类 -- Writer
* 字符输入流抽象类 -- Reader
* 编码：它使用指定的编码将得到的字符编码为字节--OutputStreamWriter(OutputStream out,String charset)->OutputStreamWriter(new FileOutputStream(String name))
* 解码：它读取字节，并使用指定的编码将其解码为字符--InputStreamReader(InputStream in,String charset)->InputStreamReader(new FileInputStream(String name))
* 字符输出流对象--FileWriter(String name)
* 字符输入流对象--FileReader(String name)
* 字符缓冲输出流对象--BufferedWriter(Writer out)->BufferedWriter(new FileWriter(String name))
* 字符缓冲输入流对象--BufferedReader(Reader in)->BufferedReader(new FileReader(String name))
* 字符缓冲流特有方法：BufferedWriter->newLine()
* BufferedReader->readLine()
* */

import java.io.*;

/*
对象序列化介绍
    对象序列化：就是将对象保存到磁盘中，或者在网络中传输对象
    这种机制就是使用一个字节序列表示一个对象，该字节序列包含：对象的类型、对象的数据和对象中存
    储的属性等信息
    字节序列写到文件之后，相当于文件中持久保存了一个对象的信息
    反之，该字节序列还可以从文件中读取回来，重构对象，对它进行反序列化
对象序列化流： ObjectOutputStream
    将Java对象的原始数据类型和图形写入OutputStream。 可以使用ObjectInputStream读取（重构）对
    象。 可以通过使用流的文件来实现对象的持久存储。 如果流是网络套接字流，则可以在另一个主机上或
    另一个进程中重构对象
* */
public class j9_objectStream_write_read {
    public static void main(String[] args) {
        // 对象序列化
        // ObjectOutputStream(OutputStream out)--创建一个写入指定的OutputStream对象的ObjectOutputStream对象
        // void writeObject(Object obj)--将指定的对象写入ObjectOutputStream对象
        //
        try (ObjectOutputStream objOutStream = new ObjectOutputStream(new FileOutputStream("myFile2/j1_Student.txt"))) {
            j1_Student stu = new j1_Student("101223", "zmz", 82, 69, 106);
            // 一个对象想要被序列化，它的类必须实现Serializable接口
            // Serializable是一个标记接口，实现该接口，不需要重写如何方法，因为这个接口中没有如何抽象方法
            objOutStream.writeObject(stu);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 对象反序列化
        // ObjectInputStream(InputStream in) -- 创建从指定的InputStream对象读取的ObjectInputStream对象
        // Object readObject() -- 从ObjectInputStream对象读取一个对象
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("myFile2/j1_Student.txt"))) {
            final Object object = objectInputStream.readObject();
            j1_Student stu = (j1_Student) object;
            System.out.println(stu.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
