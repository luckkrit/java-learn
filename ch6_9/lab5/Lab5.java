package ch6_9.lab5;

import ch6_9.lab3.Employee;

public class Lab5 {
    public static void main(String[] args) {
        Employee employee = new Employee("Krit", "Chomaitong", 5000);
        System.out.printf("Employee '%s %s' has salary $%d\n", employee.firstname, employee.lastname, employee.getSalary());
        System.out.printf("Employee has name %s\n", employee.getEmployeeName());
        Programmer programmer = new Programmer("Krit", "Chomaitong", 5000, "Frontend");
        System.out.printf("Programmer has name %s is specialize in %s\n", programmer.getEmployeeName(), programmer.getSpecialize());
    }
}
