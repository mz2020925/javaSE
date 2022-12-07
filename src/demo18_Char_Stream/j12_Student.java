package demo18_Char_Stream;

/**
 * @ClassName j12_Student
 * @Description TODO
 * @date 2022/11/26 14:48
 * @Version 1.0
 */
public class j12_Student {
    private String id;
    private String name;
    private int age;


    public j12_Student() {
    }

    public j12_Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "j12_Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}
