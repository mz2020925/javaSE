package demo19_Std_IO_ObjectStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class j4_try_catch {
    public static void main(String[] args) {

    }

    // 直接抛出处理
    private static void method() throws IOException {
        FileReader fr = new FileReader("fr.txt");
        FileWriter fw = new FileWriter("fw.txt");
        char[] chs = new char[1024];
        int len;
        while ((len = fr.read()) != -1) {
            fw.write(chs, 0, len);
        }
        fw.close();
        fr.close();
    }

    private static void method1() {
        // 常规捕获异常的方式:try...catch...finally
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("myFile2/charStream.txt");
            fw = new FileWriter("myFile2/charStream2.txt");

            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    private static void method2() {
        // JDK7的改进方案，不需要finally，会自动释放资源
        try (FileReader fr = new FileReader("myFile2/charStream.txt");
             FileWriter fw = new FileWriter("myFile2/charStream2.txt")) {
            // 注意现在用的是字符流，
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method3() throws IOException {
        // JDK9的改进方案，不需要finally，会自动释放资源,但是要抛出异常
        FileReader fr = new FileReader("myFile2/charStream.txt");
        FileWriter fw = new FileWriter("myFile2/charStream2.txt");
        // 注意这里是分号
        try (fr; fw) {
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fw.write(chars, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
