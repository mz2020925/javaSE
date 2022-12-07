package demo1_baseRules;
/*
    成员变量
        private修饰
    构造方法
        提供一个无参构造方法
        提供一个有参构造方法
    成员方法
        提供每一个成员变量对应的setXXX()/getXXX()方法
        提供一个显示对象信息的方法show()
 */
public class j9_stdClass {
    // 成员变量
    private String name;
    private int age;
    // 构造方法
    public j9_stdClass(){}
    public j9_stdClass(String name, int age){
        this.name = name;
        this.age = age;
    }
    // 成员方法 -- 这里不含main方法的类中，成员方法没有加static修饰
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void show(){
        System.out.println("类属性："+name+","+age);
    }

}
