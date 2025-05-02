import java.util.ArrayList;
import java.util.HashSet;
@SuppressWarnings("All")
public class UniqueSum_Lab9 {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList with duplicates
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(5);

        // Step 2: Convert to HashSet to get unique values
        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        // Step 3: Calculate the sum of unique values
        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }


        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum of unique values: " + sum);
    }
}

