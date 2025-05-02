import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


@SuppressWarnings("ALL")
public class StudentWriter_Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        int rollNumber = 0;
        String grade;


        System.out.print("Enter student name: ");
        name = input.nextLine();


        while (true) {
            try {
                System.out.print("Enter roll number: ");
                rollNumber = input.nextInt();
                input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a numeric roll number.");
                input.nextLine();
            }
        }

        System.out.print("Enter grade (A/B/C/etc.): ");
        grade = input.nextLine();

        // Writing to file in append mode
        try (FileWriter writer = new FileWriter("student.txt", true)) {
            writer.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println(" Student details successfully saved in 'student.txt'.");
        } catch (IOException e) {
            System.out.println("Error: Unable to write to the file.");
        } finally {
            input.close();
            System.out.println("    File operation completed.");
        }
    }
}
