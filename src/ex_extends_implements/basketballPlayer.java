package ex_extends_implements;

public class basketballPlayer extends Player{
    public basketballPlayer() {
    }

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃东西");
    }

    @Override
    public void sport() {
        System.out.println("篮球运动员打篮球");
    }

}
