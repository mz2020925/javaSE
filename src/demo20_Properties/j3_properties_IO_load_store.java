package demo20_Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class j3_properties_IO_load_store {
    /*
    void load(InputStream inStream) -- 从输入字节流读取属性列表（键和元素对）
    void load(Reader reader) -- 从输入字符流读取属性列表（键和元素对）
    void store(OutputStream out, String comments) -- 将此属性列表（键和元素对）写入此Properties表中，以适合于使用load(InputStream)方法的格式写入输出字节流
    void store(Writer writer, String comments) -- 将此属性列表（键和元素对）写入此  Properties表中，以适合使用load(Reader)方法的格式写入输出字符流
    * */
    public static void main(String[] args) {
        // 通过字符流把Properties集合中的数据写入文件
        myStore();


        // 通过字符流把文件中的数据存入Properties集合
        myLoad();
    }

    private static void myStore() {
        Properties prop = new Properties();
        prop.setProperty("1", "zmz");
        prop.setProperty("2", "zzz");
        prop.setProperty("3", "zmm");
        // 通过字符流把Properties集合中的数据写入文件
        try (FileWriter fw = new FileWriter("myFile2/properties.txt")) {
            prop.store(fw, "把properties集合写入文件");  // comments是描述信息，不想给就null,但是中文comments在文件中无法显示原样
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static void myLoad() {
        try (FileReader fr = new FileReader("myFile2/properties.txt")) {
            Properties prop = new Properties();
            prop.load(fr);
            // 输出集合，看看存入的元素
            System.out.println(prop);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
