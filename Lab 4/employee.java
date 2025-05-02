public class employee {
    private int employeeID;
    private String name;
    private String department;
    private double salary;
    static int totalEmployees = 0;
    public employee(){
        this.employeeID = 0;
        this.name = "Not Assigned";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++;
    }
    public employee(int employeeID, String name, String department, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }
    public double calculateSalary(){
        return salary;
    }
    public void displayemployeeInfo(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
    public static void displayTotalEmployees(){
        System.out.println("Total Employees: " + totalEmployees);
    }
    public static void main(String[] args){
        employee e1 = new employee();
        e1.displayemployeeInfo();
        employee e2 = new employee(1, "Ayush", "CSE", 100000.0);
        e2.displayemployeeInfo();
        employee e3 = new employee(2, "Daksh", "ECE", 200000.0);
        e3.displayemployeeInfo();
        displayTotalEmployees();
    }
}