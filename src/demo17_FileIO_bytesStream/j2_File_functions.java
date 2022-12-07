package demo17_FileIO_bytesStream;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class j2_File_functions {
    public static void main(String[] args) throws IOException {
        /* 三、File类判断和获取功能
         * public boolean isDirectory()--测试此抽象路径名表示的File是否为目录
         * public boolean isFile()--测试此抽象路径名表示的File是否为文件
         * public boolean exists()--测试此抽象路径名表示的File是否存在
         * public String getAbsolutePath()--返回此抽象路径名的绝对路径名字符串
         * public String getPath()--将此抽象路径名转换为路径名字符串
         * public String getName()--返回由此抽象路径名表示的文件或目录的名称
         * public String[] list()--返回此抽象路径名表示的目录中的文件和目录的名称字符串数组
         * public File[] listFiles()--返回此抽象路径名表示的目录中的文件和目录的File对象数组
         * */
        File f8 = new File("E:\\itcast");
        System.out.println(f8.isDirectory());
        System.out.println(f8.isFile());
        System.out.println(f8.exists());

        System.out.println(f8.getAbsolutePath());
        System.out.println(f8.getPath());
        System.out.println(f8.getName());

        File f9 = new File("E:\\itcast");
        String[] strArr = f9.list();
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr);

        File[] fileArr = f9.listFiles();
        System.out.println(Arrays.toString(fileArr));
        for (File file:fileArr){
            if (file.isFile()){
                System.out.println(file.getName());
            }
        }
        System.out.println("--------");

        /*
        * 四、File类删除功能
        * public boolean delete()--删除由此抽象路径名表示的文件或目录
        * */
        // 下面两行代码说明 ./代表的当前目录是"E:\AllCode_Design\Coding_Files\IntelliJ_IDEA_Files\javaSE\."
        // 而不包括src/包名
        //File file = new File("./");
        //System.out.println(file.getAbsolutePath());

        // 需求1：在当前模块目录下创建java.txt文件
        // 注意javaSE是一个模块，工程名也叫javaSE，存放工程的文件夹也叫javaSE，工程是包含模块的
        File f1 = new File("a.txt");
        System.out.println(f1.createNewFile());

        // 需求2：删除当前模块目录下的java.txt文件
        System.out.println(f1.delete());

        // 需求3：在当前模块目录下创建itcast目录
        File f2 = new File("myfile");
        System.out.println(f2.mkdir());
        // 需求4：删除当前模块目录下的itcast目录
        System.out.println(f2.delete());

        // 需求5：在当前模块下创建一个目录itcast,然后在该目录下创建一个文件java.txt
        File f3 = new File("myFile\\itcast");
        System.out.println(f3.mkdirs());
        File f4 = new File("myFile\\itcast\\java.txt");
        System.out.println(f4.createNewFile());
        //需求6：删除当前模块下的目录itcast
        System.out.println(f4.delete());
        System.out.println(f3.delete());

        // 删除当前模块下的目录myFile
        File f5 = new File("myFile");
        System.out.println(f5.delete());

    }
}
