package Lab7.Office_Lab7;

class Manager extends Employee {
    private String name;
    private double fixedSalary;

    Manager(String name, double fixedSalary) {
        this.name = name;
        this.fixedSalary = fixedSalary;
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: " + fixedSalary);
    }

    @Override
    void displayDetails() {
        System.out.println("Name: " + name + ", Role: Manager, Salary: " + fixedSalary);
    }
}