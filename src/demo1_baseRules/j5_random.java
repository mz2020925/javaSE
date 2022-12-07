package demo1_baseRules;
import java.util.Random;

public class j5_random {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int number = random.nextInt(10);
            System.out.println(number);
        }
    }
}
