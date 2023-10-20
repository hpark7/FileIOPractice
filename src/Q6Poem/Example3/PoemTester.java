package Q6Poem.Example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PoemTester {

    public static void main(String[] args) throws IOException {
        // Create an array to store Poem objects
        Poem[] poems = new Poem[3];

        try (
                FileReader file = new FileReader("poems.txt");
                BufferedReader br = new BufferedReader(file);
        ) {
            // Read and create Poem objects from the file
            for (int i = 0; i < poems.length; i++) {
                poems[i] = new Poem();
                poems[i].setName(br.readLine());
                poems[i].setPoet(br.readLine());
            }
        }

        // Use Scanner to read from console
        Scanner scanner = new Scanner(System.in);

        try (
                PrintWriter pw = new PrintWriter("outputs.txt");
        ) {
            // Write poem information to "output.txt" using a loop
            for (int i = 0; i < poems.length; i++) {
                pw.println("Name: " + poems[i].getName());
                pw.println("Poet: " + poems[i].getPoet());
                pw.println(); // Empty line for separation

//                // Prompt for user input to continue
//                if (i < poems.length - 1) {
//                    System.out.print("Press Enter to continue...");
//                    scanner.nextLine();
//                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}
