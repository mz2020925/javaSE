package demo18_Char_Stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
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
public class j1_Char_code_encode {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
        * byte[] getBytes()--使用平台的默认字符集将该 String编码为一系列字节
        * byte[] getBytes(String charsetName)--使用指定的字符集将该 String编码为一系列字节
        * String(byte[] bytes)--使用平台的默认字符集解码指定的字节数组来创建字符串
        * String(byte[] bytes, String charsetName)--通过指定的字符集解码指定的字节数组来创建字符串
        * */
        // 定义中文字符串
        String str = "中国";

        // 把中文字符串编码
        byte[] bys1 = str.getBytes();
        System.out.println(bys1);
        System.out.println(Arrays.toString(bys1));
        System.out.println(new String(bys1,0,bys1.length));

        byte[] bys2 = str.getBytes("UTF-8");
        System.out.println(Arrays.toString(bys2));
        byte[] bys3 = str.getBytes("GBK");
        System.out.println(Arrays.toString(bys3));

        System.out.println("--------");
        // 把编码得到的“字节编码”解码成文件
        String ss1 = new String(bys1);
        System.out.println(ss1);
        String ss2 = new String(bys2, "UTF-8");
        System.out.println(ss2);
        String ss3 = new String(bys3, "GBK");  // 如果这里编码方式改成UTF-8
        System.out.println(ss3);






    }
}
