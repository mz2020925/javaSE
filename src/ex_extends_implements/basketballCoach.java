package ex_extends_implements;

public class basketballCoach extends Coach implements SpeakEnglish{
    public basketballCoach() {
    }

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃东西");
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("篮球教练说英语");
    }
}
