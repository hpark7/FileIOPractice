package Q1ReadingFile;
import java.io.*;

/**
 * ReadFileInOrderRecursion.java
 * BufferedReader
 * FileReader
 */
//
public class ReadFileInOrderRecursion {
    public static void main(String[] args) {
        readFileInOrder("data.txt");
    }

    private static void readFileInOrder(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            readNextLine(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readNextLine(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        if (line != null) {
            // Print the current line
            System.out.println(line);
            // Recursively read the next line
            readNextLine(reader);
        }
    }
}
