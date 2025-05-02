import java.util.Scanner;

public class AreaCalc_V2 {

    public double calculateArea(double length, double width) {
        return length * width;
    }


    public double calculateArea(double side) {
        return side * side;
    }


    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius;
    }


    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        AreaCalc_V2 calculator = new AreaCalc_V2();
        Scanner scanner = new Scanner(System.in);

        // Prompt user to select a shape
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double area = 0;

        switch (choice) {
            case 1: // Rectangle
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                area = calculator.calculateArea(length, width);
                break;

            case 2: // Square
                System.out.print("Enter the side of the square: ");
                double side = scanner.nextDouble();
                area = calculator.calculateArea(side);
                break;

            case 3: // Circle
                System.out.print("Enter the radius of the circle: ");
                double radius = scanner.nextDouble();
                area = calculator.calculateArea(radius, true);
                break;

            case 4: // Triangle
                System.out.print("Enter the base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                area = calculator.calculateArea(base, height, true);
                break;

            default:
                System.out.println("Invalid choice. Please select a number between 1 and 4.");
                scanner.close();
                return;
        }


        System.out.println("The area of the selected shape is: " + area);

        scanner.close();
    }
}
