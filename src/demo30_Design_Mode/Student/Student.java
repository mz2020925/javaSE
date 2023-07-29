package demo30_Design_Mode.Student;


public class Student {
    // 构造方法
    private Student(){}

    // 为了让 students.xml 能够在静态方法中使用，需要加static，静态变量在类加载的时候就会分配空间并完成赋值
    // 为了不让外界访问修改此变量的值，加private
    // 一般情况下，此变量的值是不变的，加final
    private final static Student student = new Student();
    // 为了让外界直接访问该方法，用static方法
    public static Student getJ1_Student(){
        return student;
    }
}
