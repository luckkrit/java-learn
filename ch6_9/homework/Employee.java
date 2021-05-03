package ch6_9.homework;

public class Employee {
    public String firstname;
    public String lastname;
    private int salary;

    public Employee(String firstnameInput, String lastnameInput, int salaryInput) {
        this.firstname = firstnameInput;
        this.lastname = lastnameInput;
        this.salary = salaryInput;
    }

    public void hello() {
        System.out.println("Hello " + this.firstname);
    }

    public int getSalary() {
        return salary;
    }

    public void gossip(Employee employee, String s) {
        System.out.println("Hey " + employee.firstname + ", " + s);
    }

    protected void setSalary(int newSalary) {
        this.salary = newSalary;
    }
}
