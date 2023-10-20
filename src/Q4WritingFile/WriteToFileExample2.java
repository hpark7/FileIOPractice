package Q4WritingFile;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample2 {
    public static void main(String[] args) {
        String data = "LINES OF TEXT\n";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
