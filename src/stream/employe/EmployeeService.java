package stream.employe;

import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class EmployeeService {

    public List<Employee> getEmployeesByDepartment(final List<Employee> employees ,final String department) {

        return employees
                    .stream()
                    .filter(employee -> employee.getDepartment().equals(department))
                    .collect(Collectors.toList());
        }

        public List<Employee> getEmployeesByMinSalary(final List<Employee> employees ,final Double minSalary){

           return employees.stream()
                    .filter(employee -> employee.getSalary() > minSalary)
                    .collect(Collectors.toList());
        }

        public List<String> getAllEmployeeNames(final List<Employee> employees ){

        return employees
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        }



        public Double getTotalSalaryExpense(final List<Employee> employees ){

       /* return employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .sum();*/

            return employees
                    .stream()
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);
        }

        public Map<String,Long> getEmployeeCountByDepartment( final List<Employee> employees){

        return employees
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
        }

}
