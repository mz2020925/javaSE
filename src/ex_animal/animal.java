package ex_animal;

public class animal {
    private String name;
    private int age;

    public animal() {
    }

    public animal(String name, int age) {
        this.name = name;
        this.age = age;
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

    public void methond(){
        System.out.println(this.name + this.age);
    }

    private void methond2(){
        System.out.println("private method");
    }


    public static void main(String[] args) {
        animal an = new animal();
        an.methond2();  // 在含private本类中创建main函数并创建对象，是可以调用private方法
    }

}
