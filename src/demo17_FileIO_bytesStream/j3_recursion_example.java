package demo17_FileIO_bytesStream;


import java.io.File;
import java.util.ArrayList;

public class j3_recursion_example {
    // 通过递归完成遍历该目录下所有文件，并把所有文件的绝对路径输出在控制台
    public static void main(String[] args) {
        File f1 = new File("E:\\AllCode_Design\\Coding_Files\\IntelliJ_IDEA_Files\\javaSE\\src\\demo17_File");
//        System.out.println(Arrays.toString(f1.listFiles()));
//        System.out.println(Arrays.toString(f1.list()));
        ArrayList<String> arrList = new ArrayList<>();
        getAllFilePath(f1, arrList);
        System.out.println(arrList);
    }

    // 定义一个方法，用于获取给定目录下的所有文件，参数main函数中创建的File对象
    public static void getAllFilePath(File srcFlie, ArrayList<String> arrList){
        //获取给定的File目录下所有的文件和目录的File对象的数组
        File[] listFiles = srcFlie.listFiles();
        //遍历该File数组，得到每一个File对象
        if(listFiles != null){
            for(File file:listFiles){
                //判断该File对象是否是目录
                if (file.isDirectory()){
                    //是：递归调用
                    getAllFilePath(file, arrList);
                }else {
                    //不是：获取绝对路径输出在控制台，并将绝对路径字符串存入ArrayList中
                    System.out.println(file.getAbsolutePath());
                    arrList.add(file.getAbsolutePath());
                }
            }
        }
    }

}
