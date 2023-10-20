package Q6Poem.Example1;

import java.io.*;

public class PoemTester {

    public static void main(String[] args) throws IOException {

        Poem p1 = new Poem();
        Poem p2 = new Poem();
        Poem p3 = new Poem();
        try(
        FileReader file = new FileReader("poems.txt");

        BufferedReader br = new BufferedReader(file);
        ) {
            p1.setName(br.readLine());
            p1.setPoet(br.readLine());

            p2.setName(br.readLine());
            p2.setPoet(br.readLine());

            p3.setName(br.readLine());
            p3.setPoet(br.readLine());


        }

        try(FileWriter fw = new FileWriter("output.txt");
            BufferedWriter bw = new BufferedWriter(fw);
        ){
            bw.write(p1.getName() + "\n");
            bw.write(p1.getPoet() + "\n");

            bw.write(p2.getName() + "\n");
            bw.write(p2.getPoet() + "\n");

            bw.write(p3.getName() + "\n");
            bw.write(p3.getPoet() + "\n");

        }
    }
}
