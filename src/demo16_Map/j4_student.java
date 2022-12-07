package demo16_Map;

public class j4_student {
    private String name;
    private Integer age;

    public j4_student() {
    }

    public j4_student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public <T> void printFunction(T t) {
        System.out.println(t + "," + getType(t));
    }

    public String getType(Object o) {
        return o.getClass().toString();
    }

    @Override
    public String toString() {
        return "j4_student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        // 这里使用的intellij的模板
        // 先比较地址是否相同，this是本类(调用此方法的对象)，参数o是传进来的对象，就是这两个要比较
        if (this == o) return true;
        // getClass()用于获取对象的运行时对象的类(准确来说是这个类的引用)
        // 这里的getClass()没有指明前缀的类，说明是本类
        if (o == null || getClass() != o.getClass()) return false;

        // 这里把传进来的对象向下转型，因为在形参那里是向上转型，所以这里要恢复原型
        // 现在that就是传进来的参数o
        j4_student that = (j4_student) o;

        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return age != null ? age.equals(that.age) : that.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }
}
