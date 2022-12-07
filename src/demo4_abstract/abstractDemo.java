package demo4_abstract;

public class abstractDemo {
    public static void main(String[] args) {
        animal an = new cat();
        an.eat();
        animal an2 = new dog();
        an2.eat();
    }

}
