package demo19_std_IO_objectStream;

import java.io.Serializable;

public class j1_Student implements Serializable {
    private static final long serialVersionUID = 42L;
    private String id;
    private String name;
    private int chinese;
    private int math;
    private transient int english;
    private int sum;

    public j1_Student() {
    }

    public j1_Student(String id, String name, int chinese, int math, int english) {
        this.id = id;
        this.name = name;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getSum() {
        return this.chinese + this.english + this.math;
    }


    @Override
    public String toString() {
        return "j1_Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + sum +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        j1_Student student = (j1_Student) o;
//
//        if (chinese != student.chinese) return false;
//        if (math != student.math) return false;
//        if (english != student.english) return false;
//        if (id != null ? !id.equals(student.id) : student.id != null) return false;
//        return name != null ? name.equals(student.name) : student.name == null;
//    }
//
//    @Override
//    public int hashCode() {
//        int result = id != null ? id.hashCode() : 0;
//        result = 31 * result + (name != null ? name.hashCode() : 0);
//        result = 31 * result + chinese;
//        result = 31 * result + math;
//        result = 31 * result + english;
//        return result;
//    }
}
