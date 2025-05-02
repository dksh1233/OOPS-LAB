package Lab7.Office_Lab7;

public class Main{
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 7000.0);
        Employee developer = new Developer("Bob", 50.0, 160);

        manager.displayDetails();
        manager.calculateSalary();

        developer.displayDetails();
        developer.calculateSalary();
    }
}

