package demo19_Std_IO_ObjectStream;

import java.io.*;

/*
1.创建数据源File对象，路径是E:\itcast
2.创建目的地File对象，路径是F:\
3.写方法实现文件夹的复制，参数为数据源File对象和目的地File对象
4.判断数据源File是否是文件
    是文件：
        直接复制，用字节流
    不是文件：
        在目的地下创建该目录
        遍历获取该目录下的所有文件的File数组，得到每一个File对象
        回到3继续(递归)
* */
public class j3_CopyFolders {
    public static void main(String[] args) throws IOException {
        // 创建数据源文件夹对象
        File srcFolder = new File("E:\\testFolder");
        // String srcFolderName = srcFolder.getName();

        // 创建目的地文件夹对象
        File destFolder = new File("D:\\");

        // 在目的地复制（创建）文件夹（或者说是创建出多层文件夹，递归创建）
        copyFolder(srcFolder, destFolder);
    }

    private static void copyFolder(File srcFolder, File destFolder) throws IOException {
        // 判断File对象是目录还是文件
        if (srcFolder.isDirectory()) {
            // 在目的地复制出一模一样的文件夹结构
            String srcFolderName = srcFolder.getName();
            // destFolder是你要复制到哪里（哪个文件夹下），srcFolderName是你要复制的文件夹的名称
            // newFolder是将二者拼接起来了，创建出了某一级文件夹(例如第一次执行在这里就是创建出了"D:\\testFolder")
            File newFolder = new File(destFolder, srcFolderName);
            if (!newFolder.exists()){
                newFolder.mkdir();  // 这里递归复制（创建）文件夹的《核心》就在这里
            }
            // 获取数据源文件夹下所有的子文件夹和文件
            File[] srcFiles = srcFolder.listFiles();
            for (File f : srcFiles) {
                copyFolder(f, newFolder);  // 递归调用
            }

        }else {
            // 如果是文件，则直接复制到目的地，用字节流
            // destFolder始终都是文件夹，不可能是文件，srcFolder.getName()是一个文件的文件名
            File newFile = new File(destFolder, srcFolder.getName());
            copyFile(srcFolder, newFile);
        }
    }

    private static void copyFile(File srcFile, File destFile) throws IOException {
        BufferedInputStream buffInStream = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream buffOutStream = new BufferedOutputStream(new FileOutputStream(destFile));

        byte[] bytes = new byte[1024];
        int len;
        while ((len=buffInStream.read(bytes))!=-1){
            buffOutStream.write(bytes,0,len);
        }

        buffInStream.close();
        buffOutStream.close();
    }
}
