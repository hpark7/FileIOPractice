package Q6Poem.Example4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PoemTesterList {

    public static void main(String[] args) throws IOException {
        // Create a list to store Poem objects
        List<Poem> poems = new ArrayList<>();

        try (
                Scanner fileScanner = new Scanner(new File("src/ch5Ex2/Example4/poems.txt"));
        ) {
            // Read and create Poem objects from the file
            while (fileScanner.hasNextLine()) {
                Poem poem = new Poem();
                poem.setName(fileScanner.nextLine());
                poem.setPoet(fileScanner.nextLine());
                poems.add(poem);
            }
        }

        try (
                PrintWriter pw = new PrintWriter(new FileWriter("src/ch5Ex2/Example4/outputs.txt"));
        ) {
            // Write poem information to "output.txt" using a loop
            for (int i = 0; i < poems.size(); i++) {
                pw.println("Poem " + (i + 1) + ":");
                pw.println("Name: " + poems.get(i).getName());
                pw.println("Poet: " + poems.get(i).getPoet());
                pw.println(); // Empty line for separation
            }
        }
    }
}
