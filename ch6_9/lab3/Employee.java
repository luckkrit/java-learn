package ch6_9.lab3;

public class Employee {
    public String firstname;
    public String lastname;
    private int salary;

    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
        firstname = firstnameInput;
        lastname = lastnameInput;
        salary = salaryInput;
    }

    public void hello() {
        System.out.println("Hello " + firstname);
    }

    public int getSalary() {
        return salary;
    }
}
