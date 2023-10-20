package Q1ReadingFile;
/**
 * ReverseFileReader.java
 * FileReader
 * BufferedReader
 *
 */
//

import java.io.*;
import java.util.*;

/**
 * ReverseFileReader.java
 * FileReader
 * BufferedReader
 *
 */
public class ReverseFileReader {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        // Read the file into a list
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Iterate through the list in reverse order and print
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
