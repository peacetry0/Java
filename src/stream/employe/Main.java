package stream.employe;
import java.util.Arrays;
import java.util.List;


public class Main {


    public static void main(String[] args) {

        final List<Employee> employees = Arrays.asList(
                new Employee(1, "Peace", "IT", 30000.00),
                new Employee(2, "Peacetry", "HR", 20000.00),
                new Employee(3, "Ahmet", "Finance", 30000.00),
                new Employee(4, "Mehmet", "IT", 50000.00),
                new Employee(5, "Zeynep", "HR", 10000.00),
                new Employee(6, "Ayşe", "Finance", 70000.00),
                new Employee(7, "Ali", "IT", 80000.00)
        );

        final EmployeeService employeeService = new EmployeeService();

        System.out.println("IT employees  " + employeeService.getEmployeesByDepartment(employees,"IT"));
        System.out.println("Employees with salary > 50000 : " + employeeService.getEmployeesByMinSalary(employees,50000.00));
        System.out.println("All names with employees : " + employeeService.getAllEmployeeNames(employees));
        System.out.println("Total Salary : " + employeeService.getTotalSalaryExpense(employees));
        System.out.println("Employee Count By Department : " + employeeService.getEmployeeCountByDepartment(employees));

    }
}
