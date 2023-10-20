package Q6Poem.Example3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class PoemTesterList {

    public static void main(String[] args) throws IOException {
        // Create a list to store Poem objects
        List<Poem> poems = new ArrayList<>();

        try (
                FileReader file = new FileReader("src/ch5Ex2/Example3/poems.txt");
                BufferedReader br = new BufferedReader(file);
        ) {
            // Read and create Poem objects from the file
            String line;
            while ((line = br.readLine()) != null) {
                Poem poem = new Poem();
                poem.setName(line);
                line = br.readLine();
                if (line != null) {
                    poem.setPoet(line);
                }
                poems.add(poem);
            }
        }

        try (
                PrintWriter pw = new PrintWriter("src/ch5Ex2/Example3/outputs.txt");
        ) {
            // Write poem information to "outputs.txt" using a loop
            for (Poem poem : poems) {
                pw.println("Name: " + poem.getName());
                pw.println("Poet: " + poem.getPoet());
                pw.println(); // Empty line for separation
            }
        }
    }
}
