package demo1_baseRules;

public class j4_for_while_dowhile {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("第" + i + "次循环");
        }

        System.out.println("----------------");
        int i = 0;
        while (i < 10) {
            System.out.println("第" + i + "次循环");
            i++;
        }

        System.out.println("----------------");
        i = 0;
        do {
            System.out.println("第" + i + "次循环");
            i++;
        } while (i < 10);
    }
}
