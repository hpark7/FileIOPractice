package Q6Poem.Example4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PoemTester {

    public static void main(String[] args) throws IOException {
        // Create an array to store Poem objects
        Poem[] poems = new Poem[3];

        try (
                Scanner fileScanner = new Scanner(new File("src/ch5Ex2/Example4/poems.txt"));
        ) {
            // Read and create Poem objects from the file
            for (int i = 0; i < poems.length; i++) {
                poems[i] = new Poem();
                poems[i].setName(fileScanner.nextLine());
                poems[i].setPoet(fileScanner.nextLine());
            }
        }

        try (
                PrintWriter pw = new PrintWriter(new FileWriter("src/ch5Ex2/Example4/outputs.txt"));
        ) {
            // Write poem information to "output.txt" using a loop
            for (int i = 0; i < poems.length; i++) {
                pw.println("Poem " + (i + 1) + ":");
                pw.println("Name: " + poems[i].getName());
                pw.println("Poet: " + poems[i].getPoet());
                pw.println(); // Empty line for separation
            }
        }
    }
}
