package ex_extends_implements;

public class pingpangCoach extends Coach implements SpeakEnglish{

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃东西");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
