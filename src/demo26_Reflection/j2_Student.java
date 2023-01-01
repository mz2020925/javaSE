package demo26_Reflection;

public class j2_Student {
    // 成员变量：一个私有，一个默认，一个公共
    private String name;
    int age;
    public String address;


    // 构造方法：一个私有，一个默认，两个公共
    public j2_Student() {

    }

    private j2_Student(String name) {
        this.name = name;
    }

    j2_Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public j2_Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // 成员方法：一个私有，10个公共
    private void function() {
        System.out.println("function");
    }

    public void method1() {
        System.out.println("method1被调用");
    }

    public void method2(String s) {
        System.out.println("method2被调用：" + s);
    }

    public String method3(String s, int i) {
        return s + ",method3被调用," + i;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "j2_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }


}
