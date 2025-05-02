import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
@SuppressWarnings("ALL")
public class StudentFileReader_lab8 {
    public static void main(String[] args) {
        File file = new File("student.txt"); // File object

        try (FileReader reader = new FileReader(file)) {
            int character;

            System.out.println("Contents of 'student.txt':");
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }

        } catch (FileNotFoundException e) { // Handling missing file
            System.out.println("Error: File 'student.txt' not found. Please check the file location.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        }
    }
}

