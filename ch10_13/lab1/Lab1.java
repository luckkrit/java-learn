package ch10_13.lab1;

import ch6_9.lab3.Employee;

public class Lab1 {
    public static void main(String[] args) {
        Employee employee = new Employee("Krit", "Chomaitong", 5000);
        CEO ceo = new CEO("Krit", "Chomaitong", 500000);
        Programmer programmer = new Programmer("Krit", "Chomaitong", 3500);
        System.out.printf("Employee name '%s' has salary '%s'\n", employee.getEmployeeName(), employee.getSalary());
        System.out.printf("CEO name '%s' has salary '%s'\n", ceo.getEmployeeName(), ceo.getSalary());
        System.out.printf("Programmer name '%s' has salary '%s'\n", programmer.getEmployeeName(), programmer.getSalary());
        programmer.createWebsite("index.html", "CTF02");
        programmer.installWindows("10", "xxxx-xxxx-xxxx-xxxx-xxxx");
    }
}
