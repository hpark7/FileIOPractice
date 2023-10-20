package Q2WritingFile;
/**
 * WriteToFileExample.java
 * FileWriter
 *
 */

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {
    public static void main(String[] args) {
        String data = "ONE LINE OF TEXT\nANOTHER LINE OF TEXT\n"; //two lines of text
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
