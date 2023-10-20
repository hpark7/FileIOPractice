package Q4WritingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample3 {
    public static void main(String[] args) {
        String[] lines = {"POEM 1", "POEM 2", "POEM 3"};
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine(); // Add a newline character
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
