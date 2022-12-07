package demo18_Char_Stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;

/**
 * @ClassName j13_FileToCollectionObj
 * @Description TODO
 * @date 2022/11/26 15:01
 * @Version 1.0
 */
public class j13_FileToCollectionObj {
    public static void main(String[] args) throws IOException {
        // 创建字符缓冲输入流对象
        BufferedReader bufferedReader = new BufferedReader(new FileReader("myFile2/charStream.txt"));

        // 创建ArrayList集合对象
        ArrayList<j12_Student> studentArrayList = new ArrayList<>();

        // 把文件中的内容存入集合（以元素为对象的方式）
        // 其实就是字符串处理，先读取，再分割成数组，再赋给对象的属性，再把对象存入数组
        String line;
        while ((line=bufferedReader.readLine())!=null){
            String[] strArray = line.split(",");

            j12_Student stu = new j12_Student();
            stu.setId(strArray[0]);
            stu.setName(strArray[1]);
            stu.setAge(Integer.parseInt(strArray[2]));


            studentArrayList.add(stu);
        }

        bufferedReader.close();

        for (j12_Student stu : studentArrayList) {
            System.out.println(stu);
        }

    }
}
