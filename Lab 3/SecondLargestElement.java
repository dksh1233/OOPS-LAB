import java.util.Scanner;

public class SecondLargestElement {
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            return -1; // Not enough elements to have a second largest
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return (secondLargest == Integer.MIN_VALUE) ? -1 : secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Not enough elements to find the second largest.");
            return;
        }

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        int result = findSecondLargest(arr);
        if (result == -1) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("Second largest element: " + result);
        }

        scanner.close();
    }
}
