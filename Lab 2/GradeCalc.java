import java.util.Scanner;

public class GradeCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter marks for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int subject3 = scanner.nextInt();


        int average = (subject1 + subject2 + subject3) / 3;


        char grade;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }


        System.out.println("Average Marks: " + average);
        System.out.println("Final Grade: " + grade);

        scanner.close();
    }
}
