package demo19_Std_IO_ObjectStream;

import java.io.*;

public class j8_printStream_copyJavaFile {

    public static void main(String[] args) {
        try (BufferedReader buffReader = new BufferedReader(new FileReader("myFile2/printStream.txt"));
             PrintWriter printWriter = new PrintWriter(new FileWriter("myFile2/printStream2.txt"), true)) {

            String line;
            while ((line = buffReader.readLine()) != null) {
                printWriter.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
