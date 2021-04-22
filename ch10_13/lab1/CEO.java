package ch10_13.lab1;

import ch6_9.lab3.Employee;

public class CEO extends Employee {
    public CEO(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }

    public void orderWebsite() {
        System.out.println("Ordering website");
    }
}
