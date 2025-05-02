import java.util.HashMap;
import java.util.Map;

public class ProductInventory_Lab9 {
    public static void main(String[] args) {
        // Step 1: Create a HashMap to store product inventory
        HashMap<Integer, Integer> inventory = new HashMap<>();

        // Step 2: Add three products (productId, quantity)
        inventory.put(1001, 50);
        inventory.put(1002, 30);
        inventory.put(1003, 20);

        // Step 3: Update quantity of product with id 1002
        if (inventory.containsKey(1002)) {
            inventory.put(1002, 45); // updating quantity
        }

        // Step 4: Remove product with id 1001
        inventory.remove(1001);


        System.out.println("Final Product Inventory:");
        for (Map.Entry<Integer, Integer> entry : inventory.entrySet()) {
            System.out.println("Product ID: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
