package demo19_std_IO_objectStream;

import java.io.*;
/*
serialVersionUID
    用对象序列化流 序列化了一个对象后(把对象写入了文件中)，假如我们修改了对象所属的类，读取数据会不会出问题呢？
        会出问题，会抛出InvalidClassException异常
        （从文件中反序列化出的类还是原来的类，但是现在修改了类，当然在j1_Student stu = (j1_Student) obj;
        向下转型的过程中出现问题）
    如果出问题了，如何解决呢？
        给对象所属的类加一个serialVersionUID
            private static ﬁnal long serialVersionUID = 42L;
        然后重新序列化(把对象写入了文件中)
transient
    如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
    给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程（但这个对象还是包含这个变量的，只是把对象写入文件时不把这个变量写进文件里）
*
* */
public class j10_serialVersionUID_transient {
    public static void main(String[] args) {
//        writeObject();
        readObject();
    }

    private static void readObject() {
        // 对象反序列化
        String filename = "myFile2/j1_Student.txt";
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            Object obj = ois.readObject();
            // 在上一句代码中读取的对象已经就是j1_Student生成的对象(从下面的obj.toString()可以看出)，
            // 所以ois.readObject()首先要通过读取文件获取对应的类文件，在通过类文件创建对象，并把文件中的数据赋给对象的属性等初始化操作(这个过程需要对比stream classdesc serialVersionUID = -4990147325569142678, local class serialVersionUID = 4978220031817495908)，
            // 最终得到j1_Student对象。因此，如果《修改》了原来的类文件，
            // （准确来说是《添加》了方法、变量。删除的话也会出错，但不一定报这个错InvalidClassException，其中我修改原来的toString方法内容没有报错）
            // 那么数据赋给对象的时候对比serialVersionUID就会出错。

            // 如果是添加，就容易理解加了一个固定serialVersionUID就能解决问题，在把对象写入文件的时候serialVersionUID也被作为写入，后面修改了类，
            // 但是由于显式指定serialVersionUID，所以serialVersionUID不变。
            // 带来的效果就是我只把数据赋给原本的对象属性，新添加的属性我不管(默认初始化的值)。
            System.out.println(obj.toString());
            j1_Student stu = (j1_Student) obj;
            System.out.println(stu.toString());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

    private static void writeObject() {
        // 对象序列化
        String filename = "myFile2/j1_Student.txt";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            j1_Student stu = new j1_Student("101223", "zmz", 82, 69, 106);
            oos.writeObject(stu);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
