package demo19_std_IO_objectStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;
/*《复习》
字节流：
* 字节输出流对象--FileOutputStream(String name,boolean append)
* 字节输入流对象--FileInputStream(String name)
* 字节缓冲输出流对象--BufferedOutputStream(OutputStream out)->BuﬀeredOutputStream(new FileOutputStream(String name))
* 字节缓冲输入流对象--BufferedInputStream(InputStream in)->BuﬀeredOutputStream(new FileInputStream(String name))
字符流：（由于字节流操作中文不是特别的方便，所以Java就提供字符流）
* 编码：它使用指定的编码将得到的字符编码为字节--OutputStreamWriter(OutputStream out,String charset)->OutputStreamWriter(new FileOutputStream(String name))
* 解码：它读取字节，并使用指定的编码将其解码为字符--InputStreamReader(InputStream in,String charset)->InputStreamReader(new FileInputStream(String name))
* 字符输出流对象--FileWriter(String name)
* 字符输入流对象--FileReader(String name)
* 字符缓冲输出流对象--BufferedWriter(Writer out)->BufferedWriter(new FileWriter(String name))
* 字符缓冲输入流对象--BufferedReader(Reader in)->BufferedReader(new FileReader(String name))
* 字符缓冲流特有方法：BufferedWriter->newLine()
* BufferedReader->readLine()
* */
public class j1_CollectionToFile_sort {
    public static void main(String[] args) throws IOException {
        // 因为需要进行排序，所以这里创建的集合就不是ArrayLits<>()了，需要用到TreeSet<>()
        // 创建TreeSet<>()集合对象，按照总分从高到低排序
        TreeSet<j1_Student> stuTreeSet = new TreeSet<>(new Comparator<j1_Student>() {
            @Override
            public int compare(j1_Student o1, j1_Student o2) {
                // 主要条件：按照总分从高到低排序
                int num1 = o2.getSum() - o1.getSum();
                // 次要条件1：按照语文从高到低排序
                int num2 = num1 == 0 ? o2.getChinese() - o1.getChinese() : num1;
                // 次要条件2：按照数学从高到低排序
                int num3 = num2 == 0 ? o2.getMath() - o1.getMath() : num2;
                // 为什么不加上：次要条件3：按照英语从高到低排序。因为前三个条件如果结果都是0，那么英语成绩相减也一定是0，没有必要再比较
                // 而且这三个条件是递进关系

                // 为什么这里还要比较学号，你要直到这个匿名内部类比较器比较的是两个对象，如果return结果为0就认为两个对象相等
                // 如果return结果大于0就把o2对象放到o1对象前面，如果return结果小于0就把o2对象放到o1对象后面，
                int num4 = num3==0?o1.getId().compareTo(o2.getId()):num3;

                return num4;
            }
        });

        //键盘录入学生对象
        j1_Student stu = null;
        for (int i = 0; i < 3; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第"+i+"名学生信息：");
            System.out.print("学号：");
            String id = scanner.nextLine();
            System.out.print("姓名：");
            String name = scanner.nextLine();
            System.out.print("语文：");
            int chinese = scanner.nextInt();
            System.out.print("数学：");
            int math = scanner.nextInt();
            System.out.print("英语：");
            int english = scanner.nextInt();

            stu = new j1_Student(id, name, chinese, math, english);
            stuTreeSet.add(stu);
        }

        // 创建字符缓冲输出流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myFile2/charStream.txt"));

        // 将上述集合的内容写入文件
        for (j1_Student st : stuTreeSet) {
            bufferedWriter.write(st.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
    }
}
