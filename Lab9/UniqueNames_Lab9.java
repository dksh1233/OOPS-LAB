import java.util.HashSet;
@SuppressWarnings("ALL")
public class UniqueNames_Lab9 {
    public static void main(String[] args) {
        // Step 1: Define array with duplicates
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        // Step 2: Use HashSet to eliminate duplicates
        HashSet<String> uniqueNames = new HashSet<>();
        for (String name : names) {
            uniqueNames.add(name); // Duplicates are automatically ignored
        }

        // Step 3: Check if a specific name exists
        String searchName = "Sourabh";
        if (uniqueNames.contains(searchName)) {
            System.out.println(searchName + " is in the set.");
        } else {
            System.out.println(searchName + " is not in the set.");
        }

        // Step 4: Print unique names
        System.out.println("Unique Names:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}

