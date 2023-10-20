package Q6Poem.Example2;

import java.io.*;

public class PoemTester {
    public static void main(String[] args) throws IOException {

        Poem[] poems = new Poem[3];//type is Poem

        try(FileReader fr = new FileReader("poems.txt");
            BufferedReader br = new BufferedReader(fr);
        ){

            for(int i = 0; i < poems.length; i++){
                poems[i] = new Poem(); //create Poem objects
                poems[i].setName(br.readLine());
                poems[i].setPoet(br.readLine());
            }
        }

        try(FileWriter fw = new FileWriter("outputs.txt");
            BufferedWriter bw = new BufferedWriter(fw) ;   ){
            for (int i = 0; i < poems.length; i++) {

                bw.write("Name: " + poems[i].getName() + "\n");
                bw.write("Poet: " + poems[i].getPoet() + "\n\n");
            }
        }
    }
}
