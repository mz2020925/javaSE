package ex_animal;

public class mainclass {
    public static void main(String[] args) {
        cat cat1 = new cat();
        cat1.setAge(1);
        cat1.setName("cat1");
        cat1.methond();

        cat cat2 = new cat("cat2",2);
        cat2.methond();

        dog dog1 = new dog("dog1",3);
        dog1.methond();

        animal an = new animal();
        //an.methond2();  // 这里不是在含有private本类中创建对象并调用private方法，这里是在mainclass类中创建对象并调用private方法--这样不可行，即使mainclass和含private类在一个包下也不行
    }
}
