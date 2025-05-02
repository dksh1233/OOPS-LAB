import java.util.Scanner;

public class RotateArray {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Create a temporary array to store rotated elements
        int[] temp = new int[n];


        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }


        for (int i = k; i < n; i++) {
            temp[i] = arr[i - k];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];


        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }


        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();


        rotateArray(arr, k);


        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
