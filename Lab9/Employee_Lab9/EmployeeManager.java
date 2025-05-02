package Lab9.Employee_Lab9;


import java.util.ArrayList;

public class EmployeeManager {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();


        employees.add(new Employee("Alice", 101, 50000));
        employees.add(new Employee("Bob", 102, 55000));
        employees.add(new Employee("Charlie", 103, 60000));


        for (Employee emp : employees) {
            if (emp.id == 102) {
                emp.salary = 58000;
                break;
            }
        }


        /*employees.removeIf(emp -> emp.id == 101); // removing Alice*/


        System.out.println("Remaining Employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
