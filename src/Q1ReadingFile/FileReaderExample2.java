package Q1ReadingFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReaderExample2.java
 * FileReader
 * BufferedReader
 * IOException
 */
//
public class FileReaderExample2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
