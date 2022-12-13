package demo23_Lambda.j8_reference_construction;

public class StudentDemo {
    public static void main(String[] args) {
        // Lambda表达式
        useStudentBuilder((String name, int age) ->{
           return new Student(name, age);
        }, "zmz", 89);
        // Lambda表达式化简
        useStudentBuilder((String name, int age) -> new Student(name, age), "zmz", 89);

        // 4.引用构造方法（构造器），类名::new -- 写了实现接口的类、重写了接口的唯一抽象方法build、创建了实例化类的对象，最后将该对象以多态形式传给方法的形参stuBuilder
        useStudentBuilder(Student::new, "zmz", 89);
    }

    private static void useStudentBuilder(StudentBuilder stuBuilder, String name, int age) {
        Student stu = stuBuilder.build(name, age);
        System.out.println(stu.toString());
    }

}
