package Q1ReadingFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ReverseFileReaderRecursion.java
 * FileReader
 * BufferedReader
 * Recursion
 */
//
public class ReverseFileReaderRecursion {
    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();

        // Read the file into a list
        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {

                if (!line.isEmpty()) { // Check if the line is not empty -improved
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Start reading in reverse order using recursion
        readLinesInReverse(lines, lines.size() - 1);
    }

    private static void readLinesInReverse(List<String> lines, int index) {
        if (index >= 0) {
            System.out.println(lines.get(index));
            readLinesInReverse(lines, index - 1);
        }
    }
}
