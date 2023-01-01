package demo19_Std_IO_ObjectStream;

import java.io.*;

/*
* 把“E:\itcast”这个文件夹复制到模块目录下
1. 创建数据源目录File对象，路径是E:\itcast
2. 获取数据源目录File对象的名称
3. 创建目的地目录File对象，路径由(模块名+第2步获取的名称)组成
4. 判断第3步创建的File是否存在，如果不存在，就创建
5. 获取数据源目录下所有文件对象的数组
6. 遍历File数组，得到每一个File对象，该File对象，其实就是数据源文件
7. 获取数据源文件File对象的名称
8. 创建目的地文件File对象，路径由(目的地目录+第7步获取的名称)组成
9. 复制文件
   由于不清楚数据源目录下的文件都是什么类型的，所以采用字节流复制文件
   采用参数为File的构造方法
* */
public class j2_Copy_Folder {
    public static void main(String[] args) throws IOException {
        // 不管是目录对象还是文件对象，都是使用File创建
        // 创建 数据源目录对象，路径是E:\testFolder
        File srcFolder = new File("E:\\testFolder");
        // 获取数据源目录对象的名称：testFolder
        String srcFolderName = srcFolder.getName();

        // 创建目的地目录的File目录对象，名称是 本工程（模块）名+testFolder组成（javaSE\\testFolder）
        File destinationFolder = new File(srcFolderName);

        if (!destinationFolder.exists()) {
            destinationFolder.mkdir();
        }

        // 获取数据源目录下所有文件的数据源文件对象数组
        File[] listFiles = srcFolder.listFiles();

        // 遍历File数组，得到每一个File对象，该File对象其实就是数据源文件（是文件而不是文件夹）
        assert listFiles != null;
        for (File srcFile : listFiles) {
            // 获取数据源文件对象的名称--其实就是数据源文件的名称
            String srcFileName = srcFile.getName();
            // 创建目的地数据源文件对象（不是文件夹对象），目的地目录 + 数据源文件名称--> destinationFolder + srcFileName(="testFolder\文件名.txt(.mp4、.jpg等)")
            File destinationFile = new File(destinationFolder, srcFileName);
            // 此时srcFile的名称是"E:\\testFolder\\文件名.txt(.mp4、.jpg等)"，destinationFile的名称是"./本工程（模块）名/testFolder/文件名.txt(.mp4、.jpg等)"
            copyFile(srcFile, destinationFile);
        }


    }

    private static void copyFile(File srcFile, File destinationFile) throws IOException {
        BufferedInputStream buffInStream = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream buffOutStream = new BufferedOutputStream(new FileOutputStream(destinationFile));

        byte[] bytes = new byte[1024];
        int len;
        while ((len = buffInStream.read(bytes)) != -1) {
            buffOutStream.write(bytes, 0, len);
        }
        buffInStream.close();
        buffOutStream.close();
    }
}
