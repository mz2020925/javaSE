package demo22_IP_UDP_TCP;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * InetAddress是在一个位于java.net中的类，使用它需要导包。
 * 该类中没有构造方法，看它包含的方法是否全是静态方法，若是，则可以直接通过类名调用方法而无需创建对象。
 * 若不是，则看它是否有一个静态方法的返回值是该类的对象，这样调用这个静态方法就创建了该类的对象，进而就可以使用它的其他非静态方法了。
 *
 * 接收此类中的三个方法：
 * static InetAddress getByName(String host)--确定主机名称的IP地址。主机名称(参数)可以是机器名称，也可以是IP地址
 * String getHostName()--获取此IP地址的主机名
 * String getHostAddress()--返回文本显示中的IP地址字符串
 * */
public class j1_InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-F0V40UH");  // 创建了对象
        InetAddress address1 = InetAddress.getByName("211.83.104.118");  // 两种方式都可得到对象，推荐这种方式

        // 获取此IP地址的主机名
        String hostName = address1.getHostName();
        System.out.println(hostName);

        // IP地址
        String hostAddress = address1.getHostAddress();
        System.out.println(hostAddress);


    }
}
