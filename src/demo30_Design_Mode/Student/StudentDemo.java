package demo30_Design_Mode.Student;


/*《单例模式--饿汉式:类一加载就创建对象》
 * 如何保证类再内存中只有一个对象？
 * 1.构造方法私有
 * 2.在成员位置自己创建一个对象
 * 3.通过一个公共方法提供访问
 *
 * 在开发中使用饿汉式，因为这种方式不会出现线程安全问题
 *
 * 产生线程安全问题的三个要素：
 * 1.是否有多线程环境
 * 2.是否有共享数据
 * 3.是否有多条语句操作共享数据
 * */
public class StudentDemo {
    public static void main(String[] args) {
        // 1.这种方式创建的两个对象就是两个对象
        // j1_Student stu1 = new j1_Student();
        // j1_Student stu2 = new j1_Student();
        // System.out.println(stu1==stu2);

        // 2.单例模式--
        Student stu1 = Student.getJ1_Student();
        Student stu2 = Student.getJ1_Student();
        System.out.println(stu1.equals(stu2));
        System.out.println(stu1);
        System.out.println(stu2);
    }
}
