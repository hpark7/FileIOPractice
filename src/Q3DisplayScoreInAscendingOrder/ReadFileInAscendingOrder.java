package Q3DisplayScoreInAscendingOrder;
import java.io.*;
import java.util.*;

public class ReadFileInAscendingOrder {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length == 3) {
                    String name = parts[0] + " " + parts[1];
                    int score = Integer.parseInt(parts[2]);
                    students.add(new Student(name, score));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the students based on their scores in ascending order
        Collections.sort(students, Comparator.comparingInt(Student::getScore));

        // Print the sorted students
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getScore());
        }
    }
}