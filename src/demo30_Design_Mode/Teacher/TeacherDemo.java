package demo30_Design_Mode.Teacher;

/*《单例模式--懒汉式:类加载的时候不创建对象，需要用到某类的时候才创建对象》
 * 如何保证类再内存中只有一个对象？
 * 1.构造方法私有
 * 2.在成员位置自己创建一个对象
 * 3.通过一个公共方法提供访问
 * */
public class TeacherDemo {
    public static void main(String[] args) {
        Teacher t1 = Teacher.getTeacher();
        Teacher t2 = Teacher.getTeacher();
        System.out.println(t1.equals(t2));
        System.out.println(t1);
        System.out.println(t2);
    }
}
