package demo1_baseRules;

public class j9_studet {
    // 6.构造方法——在对象创建时被自动执行，用来初始化成员变量等对象属性。如果没有写构造方法，系统会自动创建一个无参构造方法。
    // 如果自己创建一个有参构造方法，在new 类名(这里要传构造方法的形参)，构造方法可以写多个，就像重载。
    public j9_studet(){
        System.out.println("无参构造方法");
    }



    // 1.成员变量
    String name;
    int age;
    private String gender;  // 3.private关键字——被private修饰的关键字的成员变量和成员方法不能被别的类直接使用，只能在本类中才能使用
                            // 但其他类非要使用呢，就必须通过public void setXXX()和public XXX getXXX()来使用
                            // 体现了封装特性。

    // 2.成员方法
    public void study(){
        System.out.println("好好学习，天天向上。");
    }
    public void dohomework(int num){
        String name = "zmz";  // 4.形参和方法内的变量属于局部变量
        System.out.println(name + "做了" + num + "项作业。");
    }

    // 3.private关键字对应的方法
    public void setGender(String gender) {
        this.gender = gender;  // 5.this修饰的变量指代的是成员变量，this用于解决局部变量与成员变量同名的问题
    }
    public String getGender() {
        return gender;
    }
}



