package demo19_Std_IO_ObjectStream;

import java.io.PrintStream;

public class j6_std_out {
    public static void main(String[] args) {
        // public static ﬁnal PrintStream out：标准输出流。通常该流对应于显示输出或由主机环境或用户指定的另一个输出目标
        // PrintStream的爷爷类是outputStream,所以它是一个字节输出流
        // 输出语句的本质：是一个标准字节的输出流
        PrintStream out = System.out;
        out.println("hello");
        out.print(1000);

        // System.out会创建一个标准字节输出流对象，以前我们用的输出现在可以理解了
        System.out.println("hello");
        System.out.print(1000);
    }
}
