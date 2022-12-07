import java.io.File;
import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        File file = new File("test.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));

    }
}
