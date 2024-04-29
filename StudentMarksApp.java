package studentMarks;
import java.util.*;

public class StudentMarksApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name of student " + (i + 1) + ":");
            String name = scanner.nextLine();

            int[] marks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter marks for subject " + (j + 1) + " for " + name + ":");
                marks[j] = scanner.nextInt();
            }
            scanner.nextLine();

            students[i] = new Student(name, marks);
        }

        
        System.out.println("\nStudent Names, Marks, and Total Marks:");
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
            int[] studentMarks = student.getMarks();
            for (int j = 0; j < 5; j++) {
                System.out.println("Subject " + (j + 1) + ": " + studentMarks[j]);
            }
            System.out.println("Total Marks: " + student.getTotalMarks() + "\n");
        }

        scanner.close();
    }
}
