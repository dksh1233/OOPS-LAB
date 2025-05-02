import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class FileReaderExeption_Lab8 {


    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file); // This may throw FileNotFoundException

        // Reading and printing the file contents
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String fileName = input.nextLine();

        try {
            readFile(fileName); // Calling the method that may throw an exception
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file name and try again.");
        } finally {
            System.out.println("File operation attempted.");
        }

        input.close();
    }
}

