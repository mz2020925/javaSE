package demo18_Char_Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @ClassName j12_CollectionObjToFile
 * @Description TODO
 * @date 2022/11/26 14:46
 * @Version 1.0
 */
public class j12_CollectionObjToFile {
    public static void main(String[] args) throws IOException {
        // 创建集合对象并添加j12_Student对象
        ArrayList<j12_Student> studentArrayList = new ArrayList<>();

        j12_Student student1 = new j12_Student("zmz", 123, "012547");
        j12_Student student2 = new j12_Student("zmz", 123, "012547");
        j12_Student student3 = new j12_Student("zmz", 123, "012547");
        j12_Student student4 = new j12_Student("zmz", 123, "012547");

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);
        studentArrayList.add(student4);

        // 创建字符缓冲输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charStream.txt",true));


        for (j12_Student stu : studentArrayList) {
            // 方式一：通过StringBuilder将集合内容写入文件
            // StringBuilder stringBuilder = new StringBuilder();
            // stringBuilder.append(stu.getId()).append(",").append(stu.getName()).append(",").append(stu.getAge());
            // bufferedWriter.write(stringBuilder.toString());

            // 方式二：直接使用字符串将集合内容写入文件
            bufferedWriter.write(stu.getId() + "," + stu.getName() + "," + stu.getAge());

            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
