package Q2_2_MiddleName;
import java.io.*;
import java.util.*;

//
/**
 * ReadFileInAscendingOrder.java
 * BufferedReader
 */
class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }
}

public class ReadFileInAscendingOrder {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                if (parts.length >= 2) {
                    String name = parts[0]; //first name
                    for (int i = 1; i < parts.length - 1; i++) {
                        name += " " + parts[i]; //middle name
                    }
                    int score = Integer.parseInt(parts[parts.length - 1]); //score
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
