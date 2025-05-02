import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("ALL")
public class WordCounter_Lab8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the text file name: ");
        String fileName = input.nextLine();
        File file = new File(fileName);

        int wordCount = 0;
        int charCount = 0;

        try (FileReader reader = new FileReader(file); Scanner fileScanner = new Scanner(file)) {
            // Count words
            while (fileScanner.hasNext()) {
                String word = fileScanner.next();
                wordCount++;
                charCount += word.length(); // Count non-whitespace characters
            }


            System.out.println("File: " + fileName);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File '" + fileName + "' not found.");
        } catch (IOException e) {
            System.out.println("Error: An issue occurred while reading the file.");
        } finally {
            input.close();
        }
    }
}

