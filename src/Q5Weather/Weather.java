package Q5Weather;



import java.io.*;

public class Weather {

    public static void calculateData(String input, String output) throws IOException{
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        try(
//                FileReader fr = new FileReader(inputFilePath);
//                BufferedReader br = new BufferedReader(fr);
//                FileWriter fw = new FileWriter(outputFilePath);
//                BufferedWriter bw = new BufferedWriter(fw)

                BufferedReader br = new BufferedReader(new FileReader(input));
                BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        ) {

            for (int i = 0; i < NUMBER_OF_DAYS; i++) {

                double sumTem = 0;
                double sumHum = 0;

                for (int j = 0; j < NUMBER_OF_HOURS; j++) {

                    String line = br.readLine();
                    if (line == null) {
                        break;
                    }

                    String[] elements = line.split(" ");
                    double tem = Double.parseDouble(elements[2]);
                    double hum = Double.parseDouble(elements[3]);

                    sumTem += tem;
                    sumHum += hum;
                }

                double aveTem = sumTem / NUMBER_OF_HOURS;
                double aveHum = sumHum / NUMBER_OF_HOURS;

                bw.write(String.format("Day%2d's average temperature is %3.2f\n", (i + 1), aveTem));
                bw.write(String.format("Day%2d's average humidity is %3.2f\n\n", (i + 1), aveHum));

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            calculateData("weather.txt","output.txt" );
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("Error in reading and writing. ");
            e.printStackTrace();
        }
    }

}
