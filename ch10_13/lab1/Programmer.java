package ch10_13.lab1;

import ch6_9.lab3.Employee;

public class Programmer extends Employee {
    public Programmer(String firstnameInput, String lastnameInput, int salaryInput) {
        super(firstnameInput, lastnameInput, salaryInput);
    }

    public void createWebsite(String template, String titleName) {
        System.out.printf("Create website '%s' from '%s'", titleName, template);
    }

    public void installWindows(String version, String productKey) {

        System.out.printf("Install Windows '%s' by using product key '%s'", version, productKey);
    }
}
