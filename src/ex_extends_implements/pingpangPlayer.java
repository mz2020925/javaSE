package ex_extends_implements;

public class pingpangPlayer extends Player implements SpeakEnglish{


    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃东西");
    }

    @Override
    public void sport() {
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
