package Lab7.Office_Lab7;

class Developer extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    Developer(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Developer Salary: " + salary);
    }

    @Override
    void displayDetails() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Name: " + name + ", Role: Developer, Salary: " + salary);
    }
}
