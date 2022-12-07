package demo18_Char_Stream;

import java.io.*;

public class j2_CharStream_code_encode {
    public static void main(String[] args) throws IOException {
        /*
        *字符流中和编码解码问题相关的两个类:
            InputStreamReader：--是从字节流到字符流的桥梁
                它读取字节，并使用指定的编码将其解码为字符
                它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
            OutputStreamWriter：--是从字符流到字节流的桥梁
                是从字符流到字节流的桥梁，使用指定的编码将写入的字符编码为字节
                它使用的字符集可以由名称指定，也可以被明确指定，或者可以接受平台的默认字符集
        构造方法：
        InputStreamReader(InputStream in)--使用默认字符编码创建InputStreamReader对象
        InputStreamReader(InputStream in,String chatset)--使用指定的字符编码创建InputStreamReader对象
        OutputStreamWriter(OutputStream out)--使用默认字符编码创建OutputStreamWriter对象
        OutputStreamWriter(OutputStream out,String charset)--使用指定的字符编码创建OutputStreamWriter对象
        * */

        // 从字符流到字节流的桥梁
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("myFile\\byteStream.txt"), "UTF-8");
        // 我现在已经创建好了桥梁(osw)，现在把“中国”放到桥头(字符流),这个桥梁会自动把“中国”运(write实现运)到桥尾(字节流),
        // new FileOutputStream会把桥尾的 字节对应的字符 写入 "myFile\\byteStream.txt" 中
        osw.write("中国");
        osw.close();

        // 从字节流到字符流的桥梁
        InputStreamReader isr = new InputStreamReader(new FileInputStream("myFile\\byteStream.txt"), "UTF-8");
        // 我现在已经创建好了桥梁(isr)，然后new FileOutputStream会把"myFile\\byteStream.txt"中的字符变成字节，放在桥尾(字节流)，
        // 这个桥梁会把桥尾的字节流，自动运(read实现运)到桥头(字符流)，System.out.println打印输出
        // 但似乎并不是这样，read实现运到桥头，赋给ch是一个int类型
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }
        isr.close();


    }
}
