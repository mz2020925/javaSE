package demo17_FileIO_bytesStream;

import java.io.File;
import java.io.IOException;

public class j1_File_class {
    public static void main(String[] args) throws IOException {
        /* 一、File类介绍
         *    它是文件和目录路径名的抽象表示
         *    文件和目录是可以通过File封装成对象的
         *    对于File而言，其封装的并不是一个真正存在的文件，仅仅是一个路径名而已。它可以是存在的，也可以
         *    是不存在的。将来是要通过具体的操作把这个路径的内容转换为具体存在的
         * */
        // 一、File类的构造方法
        // File(String pathname)：通过将给定的路径名字符串(这里具体到了文件)转换为抽象路径名来创建新的File实例
        File f1 = new File("E:\\0示例流程图.png");
        System.out.println(f1);

        // File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的File实例
        File f2 = new File("E:\\", "0示例流程图.png");
        System.out.println(f2);

        // File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的File实例
        File f3 = new File("E:\\");
        File f4 = new File(f3, "0示例流程图.png");
        System.out.println(f4);
        System.out.println("--------");

        /* 二、File类创建功能
         * public boolean createNewFile()--当具有该名称的文件不存在时，创建一个由该抽象路径名命名的新空文件
         * public boolean mkdir()--创建由此抽象路径名命名的目录
         * public boolean mkdirs()--创建由此抽象路径名命名的目录，包括任何必需但不存在的父目录
         * */
        //需求1：我要在E:\\itcast目录下创建一个文件java.txt
        File f5 = new File("E:\\itcast");
        f5.mkdir();
        File ff5 = new File("E:\\itcast\\java学生管理系统.txt");
        System.out.println(ff5.createNewFile());

        //需求2：我要在E:\\itcast目录下创建一个目录JavaSE
        File f6 = new File("E:\\itcast\\JavaSE");
        System.out.println(f6.mkdir());

        //需求3：我要在E:\\itcast目录下创建一个多级目录JavaWEB\\HTML
        File f7 = new File("E:\\itcast\\JavaWEB\\HTML");
        System.out.println(f7.mkdirs());
        System.out.println("--------");


    }
}
