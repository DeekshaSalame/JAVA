import java.util.Scanner;

class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;
    double gross_salary;

    // Constructor to initialize employee details
    public Employee(int emp_id, String emp_name, double basic_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        calculateGrossSalary();  // Calculate gross salary when details are initialized
    }

    // Method to calculate the gross salary
    public void calculateGrossSalary() {
        double hra = 0.10 * basic_salary; // 10% of basic salary as HRA
        double specialAllowance = 0.05 * basic_salary; // 5% as special allowance
        gross_salary = basic_salary + hra + specialAllowance;
    }

    // Method to display employee details and gross salary
    public void display() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Basic Salary: " + basic_salary);
        System.out.println("Gross Salary: " + gross_salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        // Taking user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int emp_id = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        System.out.print("Enter Employee Name: ");
        String emp_name = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basic_salary = sc.nextDouble();

        // Create an Employee object
        Employee emp = new Employee(emp_id, emp_name, basic_salary);
        emp.display();
    }
}

