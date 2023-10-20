package Q7Book;
//multiline csv data
import java.io.*;

class Stats2 {
    double sum;
    double lowest;
    double highest;
    double average;

    Stats2(double sum, double lowest, double highest, double average) {
        this.sum = sum;
        this.lowest = lowest;
        this.highest = highest;
        this.average = average;
    }
}

//
public class Book2 {
    public static void main(String[] args) {
        Stats stats = computeStats("Book1.csv");

        String result = "The sum of the numbers is: " + stats.sum + "\n" +
                "The lowest number is: " + stats.lowest + "\n" +
                "The highest number is: " + stats.highest + "\n" +
                "The average of the numbers is: " + stats.average;

        writeFile("stats.txt", result);
        display(result);
    }

    public static Stats computeStats(String filename) {
        double sum = 0;
        double lowest = 0;
        double highest = 0;
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    double num = Double.parseDouble(part.trim());
                    sum += num;
                    count++;
                    if (num < lowest) {
                        lowest = num;
                    }
                    if (num > highest) {
                        highest = num;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        double average = sum / count;
        return new Stats(sum, lowest, highest, average);
    }

    public static void writeFile(String filename, String content) {
        try (FileWriter fw = new FileWriter(filename);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void display(String content) {
        System.out.println(content);
    }
}