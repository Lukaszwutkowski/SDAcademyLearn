package streamExcersises;

import javax.persistence.Embedded;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeesBySalary {

    public static class Employee {
        private Integer id;
        private Integer salary;
        private String name;

        public Employee(Integer id, Integer salary, String name) {
            this.id = id;
            this.salary = salary;
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getSalary() {
            return salary;
        }

        public void setSalary(Integer salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", salary=" + salary +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, 3000, "John"));
        employees.add(new Employee(2, 12000, "Mark"));
        employees.add(new Employee(3, 30000, "Bill"));
        employees.add(new Employee(4, 40000, "Anne"));

        Employee employee = employees.stream()
                .filter(Objects::nonNull)
                .filter(employee1 -> employee1.getSalary() > 30000)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("Not found"));

        List<Employee> employeeSorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());

        Integer max = employees.stream()
                .map(Employee::getSalary)
                .max(Comparator.naturalOrder())
                .orElseThrow(NoSuchElementException::new);

        double average = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();


        System.out.println("List of all Employees: " + employees);

        System.out.println("Employee who is notNull and his salary is over 30000: " + employee);

        System.out.println("Employee sorted by Name: " + employeeSorted);

        System.out.println("Max salary from all Employees: " + max);

        System.out.println("Average salary: " + average);
    }
}
