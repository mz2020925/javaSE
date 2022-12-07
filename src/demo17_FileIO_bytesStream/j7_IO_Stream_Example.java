package demo17_FileIO_bytesStream;

import java.io.*;

public class j7_IO_Stream_Example {
    public static void main(String[] args) throws IOException {
        // 实现文本的复制
        File myFile2 = new File("myFile2");
        System.out.println("myFile2.mkdir() = " + myFile2.mkdir());
        FileInputStream fis = new FileInputStream("myFile\\byteStream.txt");
        FileOutputStream fos = new FileOutputStream("myFile2\\byteStream2.txt");

        /*方法一、一个一个字符（ASIIC码）的读和写
         * */
        //读写数据，复制文本文件(一次读取一个字节，一次写入一个字节)
        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }
        fos.close();
        fis.close();



        /*方法二、一次读一个字符（ASIIC码）数组的方法--其实一个字符(ASIIC码)肯定也有对应的 “字节码”，只是好像打印不出来
         * public int read(byte[] b)：从输入流读取最多b.length个字节的数据
         * 返回的是读入缓冲区的总字节数,也就是实际的读取字节个数
         * */
        FileInputStream fis2 = new FileInputStream("myFile\\byteStream.txt");
        FileOutputStream fos2 = new FileOutputStream("myFile2\\byteStream3.txt");
        byte[] bys = new byte[1024];  // 1024及其整数倍
        int len;
        while ((len = fis2.read(bys)) != -1) {
            fos2.write(bys,0,len);
            System.out.println(len);
            System.out.println(new String(bys, 0, len));
        }
        // 第一次循环就已经把整个文件中的字符读取完了，第二次循环，文件位置指针在文件末尾且又发生了文件读写操作，此时fis2.read(bys)会返回-1
        fos2.close();
        fis2.close();


        /*
        在这里先说下EOF和feof（）这个两个宏定义，EOF是不可输出字符，因此不能在屏幕上显示。由于字符的ASCII码不可能出现-1，因此EOF定义为-1是合适的。
        当读入的字符值等于EOF时，表示读入的已不是正常的字符而是文件结束符，但这适用对文本文件的读写。在二进制文件中，信息都是以数值方式存在的。
        EOF的值可能就是所要处理的二进制文件中的信息。这就出现了需要读入有用数据却被处理为“文件结束“的情况。为了解决这个问题，C提供了一个feof()函数，
        可以用它来判断文件是否结束。feof（fp）用于测试fp所指向的文件的当前状态是否为“文件结束”。如果是，函数则返回的值是1（真），否则为0（假）。

        只有当文件位置指针(fp－>_ptr)到了文件末尾，然后再发生读/写操作时，标志位(fp->_flag)才会被置为含有_IOEOF。然后再调用feof()，
        才会得到文件结束的信息。
        * */
    }


}
