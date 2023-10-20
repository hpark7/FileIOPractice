package Q4WritingFile;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileExample4 {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("output.txt"))) {
            writer.printf("Hello, %s! You will have the exam3 next week on %drd.%n", "John", 23);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
